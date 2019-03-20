package bittech.lib.commands.lnzone.internal;

import bittech.lib.protocol.Command;
import bittech.lib.utils.Btc;

public class RebalanceToOnchainCommand extends Command<RebalanceToOnchainRequest, RebalanceToOnchainResponse> {

	public static RebalanceToOnchainCommand createStub () {
		return new RebalanceToOnchainCommand("", new Btc(""));
	}
	
	public RebalanceToOnchainCommand(final String zoneChannelId, final Btc amount) {
		request = new RebalanceToOnchainRequest(zoneChannelId, amount);
	}

}
