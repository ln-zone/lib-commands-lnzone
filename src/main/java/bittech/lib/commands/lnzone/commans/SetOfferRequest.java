package bittech.lib.commands.lnzone.commans;

import bittech.lib.protocol.Request;
import bittech.lib.utils.Require;

public class SetOfferRequest implements Request {

	public final Offer offer;
	
	public SetOfferRequest(Offer offer) {
		this.offer = Require.notNull(offer, "offer");
	}

}
