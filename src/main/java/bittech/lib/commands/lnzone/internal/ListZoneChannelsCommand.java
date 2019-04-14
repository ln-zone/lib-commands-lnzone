package bittech.lib.commands.lnzone.internal;

import bittech.lib.protocol.Command;
import bittech.lib.protocol.common.NoDataRequest;

public class ListZoneChannelsCommand extends Command<NoDataRequest, ListZoneChannelsResponse> {

	public static ListZoneChannelsCommand createStub() {
		return new ListZoneChannelsCommand();
	}
	
	public ListZoneChannelsCommand() {
		this.request = new NoDataRequest();
	}

}
