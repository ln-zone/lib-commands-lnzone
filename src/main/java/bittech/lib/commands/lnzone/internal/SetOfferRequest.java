package bittech.lib.commands.lnzone.internal;

import bittech.lib.commands.lnzone.commans.Offer;
import bittech.lib.protocol.Request;
import bittech.lib.utils.Require;

public class SetOfferRequest implements Request {

	public final Offer offer;
	
	public SetOfferRequest(Offer offer) {
		this.offer = Require.notNull(offer, "offer");
	}

}
