package bittech.lib.commands.lnzone.commans;

import bittech.lib.commands.lnzone.EstablishedChannel.Status;
import bittech.lib.protocol.Response;
import bittech.lib.utils.Require;

public class GetChannelStatusResponse implements Response {
	
	public Status status;

	public GetChannelStatusResponse(Status status) {
		this.status = Require.notNull(status, "status");
	}
}
