package bittech.lib.commands.lnzone.commans;

import bittech.lib.protocol.Command;

public class WaitForChannelFundedCommand extends Command<WaitForChannelFundedRequest, WaitForChannelFundedResponse> {

	public static WaitForChannelFundedCommand createStub() {
		return new WaitForChannelFundedCommand("");
	}
	
	public WaitForChannelFundedCommand(String requestId) {
		this.request = new WaitForChannelFundedRequest(requestId);
	}

}
