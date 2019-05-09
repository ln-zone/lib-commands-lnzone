package bittech.lib.commands.lnzone.external;

import bittech.lib.commands.lnzone.commans.Offer;
import bittech.lib.protocol.Response;
import bittech.lib.utils.Require;

public class GetPeerOfferResponse implements Response {
	
	public Offer offer = new Offer();

	public GetPeerOfferResponse(Offer offer) {
		this.offer = Require.notNull(offer, "offer");
	}
}
