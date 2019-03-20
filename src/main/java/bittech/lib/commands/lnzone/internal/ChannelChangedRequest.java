package bittech.lib.commands.lnzone.internal;

import bittech.lib.commands.lnzone.CompoundChannel;
import bittech.lib.protocol.Request;
import bittech.lib.utils.Require;

public class ChannelChangedRequest implements Request {
	
	public enum ChangeType {ADDED, MODIFIED, REMOVED}
	
	public final ChangeType changeType;
	public final CompoundChannel channel;

	public ChannelChangedRequest(final ChangeType changeType, final CompoundChannel channel) {
		this.changeType = Require.notNull(changeType, "changeType");
		this.channel = Require.notNull(channel, "channel");
	}

}
