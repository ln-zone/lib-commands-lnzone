package bittech.lib.commands.lnzone.commans;

import bittech.lib.protocol.Command;
import bittech.lib.utils.Btc;

public class IncreaseFeeDepositCommand extends Command<IncreaseFeeDepositRequest, IncreaseFeeDepositResponse> {

	public static IncreaseFeeDepositCommand createStub() {
		return new IncreaseFeeDepositCommand("", new Btc(""));
	}
	
	public IncreaseFeeDepositCommand(String zoneChannelId, Btc amount) {
		this.request = new IncreaseFeeDepositRequest(zoneChannelId, amount);
	}

}
