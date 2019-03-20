package bittech.lib.commands.lnzone.internal;

import bittech.lib.protocol.Command;
import bittech.lib.protocol.common.NoDataRequest;
import bittech.lib.protocol.common.NoDataResponse;

public class RegisterChannelChangedCommand extends Command<NoDataRequest, NoDataResponse> {

	public static RegisterChannelChangedCommand createStub () {
		return new RegisterChannelChangedCommand();
	}
	
	public RegisterChannelChangedCommand() {
		request = new NoDataRequest();
	}

}
