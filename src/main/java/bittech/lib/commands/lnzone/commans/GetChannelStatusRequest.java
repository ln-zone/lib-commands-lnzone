package bittech.lib.commands.lnzone.commans;

import bittech.lib.protocol.Request;
import bittech.lib.utils.Require;

public class GetChannelStatusRequest implements Request {
	
	public final String zoneChannelId;

	public GetChannelStatusRequest(String zoneChannelId) {
		this.zoneChannelId = Require.notNull(zoneChannelId, "zoneChannelId");
	}

}
