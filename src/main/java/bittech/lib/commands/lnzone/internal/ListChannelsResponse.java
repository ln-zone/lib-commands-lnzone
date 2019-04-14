package bittech.lib.commands.lnzone.internal;

import java.util.List;

import bittech.lib.commands.lnzone.CompoundChannel;
import bittech.lib.protocol.Response;
import bittech.lib.utils.Require;

public class ListChannelsResponse implements Response {

	public List<CompoundChannel> channels;

	public ListChannelsResponse(List<CompoundChannel> channels) {
		this.channels = Require.notNull(channels, "channels");
	}

}
