package bittech.lib.commands.lnzone.external;

import bittech.lib.protocol.Command;

public class GetPeerOfferCommand extends Command<GetPeerOfferRequest, GetPeerOfferResponse> {

	public static GetPeerOfferCommand createStub() {
		return new GetPeerOfferCommand("");
	}
	
	public GetPeerOfferCommand(String uri) {
		this.request = new GetPeerOfferRequest(uri);
	}

}
