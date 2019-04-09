package bittech.lib.commands.lnzone.commans;

import bittech.lib.protocol.Command;
import bittech.lib.utils.Btc;

public class OpenZoneChannelCommand extends Command<OpenZoneChannelRequest, OpenZoneChannelResponse> {

	public static OpenZoneChannelCommand createStub() {
		Offer offer = new Offer();
		return new OpenZoneChannelCommand(new Btc(""), new Btc(""), new Btc(""), offer, "", "");
	}
	
	public OpenZoneChannelCommand(Btc peerAmount, Btc feeReserve, Btc myAmount, Offer offer, final String peerUri, final String invoice) {
		this.request = new OpenZoneChannelRequest(peerAmount, feeReserve, myAmount, offer, peerUri, invoice);
	}

}
