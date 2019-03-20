package bittech.lib.commands.lnzone;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import bittech.lib.commands.lnzone.commans.Offer;
import bittech.lib.utils.Btc;
import bittech.lib.utils.FormattedTime;
import bittech.lib.utils.FormattedTime.Precision;

public class EstablishedChannel {

	public static enum Status {
		INITIALIZED(0), WAITING_FOR_PAYMENT(1), FUNDING(2), WAITING_FOR_CONFIRMATION(3), CONFIRMED(
				4), SENDING_CLIENT_PART(5), ACTIVE(6), CLOSING(7), CLOSED(8);

		private Integer order;

		Status(int order) {
			this.order = order;
		}

		public boolean equalOrBefore(Status other) {
			return this.order <= other.order;
		}
		
		public boolean equalOrAfter(Status other) {
			return this.order >= other.order;
		}
	}

	// WAITING_FOR_PAYMENT, PAID, , SENDING_CLIENT_PART, DONE, ERROR,
	// FUNDING_CHANNEL }

	public Status status;
	public String zoneChannelId;
	public boolean owner;

	public Btc peerAmount;
	public Btc feeReserve;
	public Btc myAmount;
	public Offer offer;
	public String peerUri;
	public String zonePeerUri;

	public Btc costPerBlock;
	public Btc costPerDay;
	public int enoughFor;
	public FormattedTime enoughTill;

	public int lastBlockNumber = 0;

	public String fundingTxId;

	public void calcFields() {
		Btc fundsBase = owner ? myAmount : peerAmount;
		costPerBlock = Btc.fromBitcoins(offer.fundsAllocationFee.multiply(fundsBase.toBitcoins())
				.divide(new BigDecimal(Offer.blocksPerYear), 11, RoundingMode.FLOOR));
		if (costPerBlock.toMsat() == 0) {
			costPerBlock = Btc.fromMsat(1);
		}
		costPerDay = costPerBlock.multi(6 * 24);
		enoughFor = (int) (feeReserve.div(costPerDay));

		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(new Date());
		cal.add(Calendar.DATE, enoughFor);
		enoughTill = new FormattedTime(cal.getTime(), Precision.DAYS);
	}

}
