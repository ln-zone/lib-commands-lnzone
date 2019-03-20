package bittech.lib.commands.lnzone.commans;

import bittech.lib.protocol.Command;

public class GetChannelStatusCommand extends Command<GetChannelStatusRequest, GetChannelStatusResponse> {

	public static GetChannelStatusCommand createStub() {
		return new GetChannelStatusCommand("");
	}
	
	public GetChannelStatusCommand(String zoneChannelId) {
		this.request = new GetChannelStatusRequest(zoneChannelId);
	}

}
