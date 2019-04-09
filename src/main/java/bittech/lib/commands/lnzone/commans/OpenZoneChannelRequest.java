package bittech.lib.commands.lnzone.commans;

import bittech.lib.protocol.Request;
import bittech.lib.utils.Btc;
import bittech.lib.utils.Require;

public class OpenZoneChannelRequest implements Request {
	
	public final Btc peerAmount;
	public Btc feeReserve; //TODO: Tmp not final
	public final Btc myAmount;
	public final Offer offer;
	public final String peerUri;
	public final String invoice; // clientSide will be send using this invoice after open channel confirmed

	public OpenZoneChannelRequest(Btc peerAmount, Btc feeReserve, Btc myAmount, Offer offer, final String peerUri, final String invoiceBolt11) {
		this.peerAmount = Require.notNull(peerAmount, "peerAmount");
		this.feeReserve = Require.notNull(feeReserve, "feeReserve");
		this.myAmount = Require.notNull(myAmount, "myAmount");
		this.offer = Require.notNull(offer, "offer");
		this.peerUri = Require.notNull(peerUri, "peerUri");
		this.invoice = Require.notNull(invoiceBolt11, "invoiceBolt11");
	}

}
