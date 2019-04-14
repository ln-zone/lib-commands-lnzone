package bittech.lib.commands.lnzone.commans;

import bittech.lib.commands.lnzone.internal.GetOfferResponse;
import bittech.lib.protocol.Command;
import bittech.lib.protocol.common.NoDataRequest;

public class AskForOfferCommand extends Command<NoDataRequest, GetOfferResponse> {

	public static AskForOfferCommand createStub() {
		return new AskForOfferCommand();
	}
	
	public AskForOfferCommand() {
		this.request = new NoDataRequest();
	}

}
