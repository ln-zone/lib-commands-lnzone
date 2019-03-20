package bittech.lib.commands.lnzone.internal;

import bittech.lib.commands.lnzone.CompoundChannel;
import bittech.lib.commands.lnzone.internal.ChannelChangedRequest.ChangeType;
import bittech.lib.protocol.Command;
import bittech.lib.protocol.common.NoDataResponse;

public class ChannelChangedCommand extends Command<ChannelChangedRequest, NoDataResponse> {

	public static ChannelChangedCommand createStub () {
		return new ChannelChangedCommand(ChangeType.ADDED, new CompoundChannel());
	}
	
	public ChannelChangedCommand(final ChangeType changeType, final CompoundChannel channel) {
		request = new ChannelChangedRequest(changeType, channel);
	}

}
