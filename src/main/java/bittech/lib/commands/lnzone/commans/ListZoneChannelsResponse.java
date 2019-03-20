package bittech.lib.commands.lnzone.commans;

import java.util.List;

import bittech.lib.commands.lnzone.EstablishedChannel;
import bittech.lib.protocol.Response;
import bittech.lib.utils.Require;

public class ListZoneChannelsResponse implements Response {
	
	public List<EstablishedChannel> channels;

	public ListZoneChannelsResponse(List<EstablishedChannel> channels) {
		this.channels = Require.notNull(channels, "channels");
	}
}
