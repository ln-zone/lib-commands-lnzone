package bittech.lib.commands.lnzone.commans;

import bittech.lib.protocol.Command;
import bittech.lib.utils.Btc;

public class OpenChannelCommand extends Command<OpenChannelRequest, OpenChannelResponse> {

	public static OpenChannelCommand createStub() {
		Offer offer = new Offer();
		return new OpenChannelCommand(new Btc(""), new Btc(""), new Btc(""), offer, "", "");
	}
	
	public OpenChannelCommand(Btc peerAmount, Btc feeReserve, Btc myAmount, Offer offer, final String peerUri, final String invoice) {
		this.request = new OpenChannelRequest(peerAmount, feeReserve, myAmount, offer, peerUri, invoice);
	}

}
