package bittech.lib.commands.lnzone.commans;

import bittech.lib.protocol.Command;
import bittech.lib.protocol.common.NoDataRequest;

public class GetOfferCommand extends Command<NoDataRequest, GetOfferResponse> {

	public static GetOfferCommand createStub() {
		return new GetOfferCommand();
	}
	
	public GetOfferCommand() {
		this.request = new NoDataRequest();
	}

}
