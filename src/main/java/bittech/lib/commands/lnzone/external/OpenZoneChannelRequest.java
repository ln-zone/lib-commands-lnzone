package bittech.lib.commands.lnzone.external;

import bittech.lib.commands.lnzone.commans.Offer;
import bittech.lib.protocol.Request;
import bittech.lib.utils.Btc;
import bittech.lib.utils.Require;

public class OpenZoneChannelRequest implements Request {
	
	public final Btc peerAmount;
	public Btc feeReserve; //TODO: Tmp not final
	public final Btc myAmount;
	public final Offer offer;
	public final String peerUri;

	public OpenZoneChannelRequest(Btc peerAmount, Btc feeReserve, Btc myAmount, Offer offer, final String peerUri) {
		this.peerAmount = Require.notNull(peerAmount, "peerAmount");
		this.feeReserve = Require.notNull(feeReserve, "feeReserve");
		this.myAmount = Require.notNull(myAmount, "myAmount");
		this.offer = Require.notNull(offer, "offer");
		this.peerUri = Require.notNull(peerUri, "peerUri");
	}

}
