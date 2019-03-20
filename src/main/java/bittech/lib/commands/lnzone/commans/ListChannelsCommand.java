package bittech.lib.commands.lnzone.commans;

import bittech.lib.protocol.Command;
import bittech.lib.protocol.common.NoDataRequest;

public class ListChannelsCommand extends Command<NoDataRequest, ListChannelsResponse> {

	public static ListChannelsCommand createStub() {
		return new ListChannelsCommand();
	}
	
	public ListChannelsCommand() {
		this.request = new NoDataRequest();
	}

}
