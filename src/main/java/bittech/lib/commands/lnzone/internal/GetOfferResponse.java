package bittech.lib.commands.lnzone.internal;

import bittech.lib.commands.lnzone.commans.Offer;
import bittech.lib.protocol.Response;
import bittech.lib.utils.Require;

public class GetOfferResponse implements Response {
	
	public String uri;
	public Offer offer = new Offer();

	public GetOfferResponse(String uri, Offer offer) {
		this.uri = Require.notEmpty(uri, "uri");
		this.offer = Require.notNull(offer, "offer");
	}
}
