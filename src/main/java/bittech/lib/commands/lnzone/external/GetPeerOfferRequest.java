package bittech.lib.commands.lnzone.external;

import bittech.lib.protocol.Request;
import bittech.lib.utils.Require;

public class GetPeerOfferRequest implements Request {
	
	public String uri;

	public GetPeerOfferRequest(String uri) {
		this.uri = Require.notNull(uri, "uri");
	}

}
