package bittech.lib.commands.lnzone.internal;

import bittech.lib.commands.lnzone.commans.Offer;
import bittech.lib.protocol.Command;
import bittech.lib.protocol.common.NoDataResponse;
import bittech.lib.utils.Require;

public class SetOfferCommand extends Command<SetOfferRequest, NoDataResponse> {

	public static SetOfferCommand createStub() {
		Offer offer = new Offer();
		return new SetOfferCommand(offer);
	}
	
	public SetOfferCommand(Offer offer) {
		this.request = new SetOfferRequest(Require.notNull(offer, "offer"));
	}

}
