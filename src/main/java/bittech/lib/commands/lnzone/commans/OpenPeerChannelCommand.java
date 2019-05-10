package bittech.lib.commands.lnzone.commans;

import bittech.lib.protocol.Command;
import bittech.lib.utils.Btc;

public class OpenPeerChannelCommand extends Command<OpenPeerChannelRequest, OpenPeerChannelResponse> {

	public static OpenPeerChannelCommand createStub() {
		Offer offer = new Offer();
		return new OpenPeerChannelCommand(new Btc(""), new Btc(""), new Btc(""), offer, "");
	}
	
	public OpenPeerChannelCommand(Btc peerAmount, Btc feeReserve, Btc myAmount, Offer offer, final String peerUri) {
		this.request = new OpenPeerChannelRequest(peerAmount, feeReserve, myAmount, offer, peerUri);
	}

}
