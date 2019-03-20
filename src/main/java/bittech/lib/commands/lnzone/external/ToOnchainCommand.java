package bittech.lib.commands.lnzone.external;

import bittech.lib.protocol.Command;
import bittech.lib.utils.Btc;

public class ToOnchainCommand extends Command<ToOnchainRequest, ToOnchainResponse> {

	public static ToOnchainCommand createStub () {
		return new ToOnchainCommand("", new Btc(""), "");
	}
	
	public ToOnchainCommand(final String zoneChannelId, final Btc amount, final String addr) {
		request = new ToOnchainRequest(zoneChannelId, amount, addr);
	}

}
