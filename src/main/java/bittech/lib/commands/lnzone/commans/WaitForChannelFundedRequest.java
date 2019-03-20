package bittech.lib.commands.lnzone.commans;

import bittech.lib.protocol.Request;
import bittech.lib.utils.Require;

public class WaitForChannelFundedRequest implements Request {
	
	public final String zoneChannelId;

	public WaitForChannelFundedRequest(String zoneChannelId) {
		this.zoneChannelId = Require.notNull(zoneChannelId, "zoneChannelId");
	}

}
