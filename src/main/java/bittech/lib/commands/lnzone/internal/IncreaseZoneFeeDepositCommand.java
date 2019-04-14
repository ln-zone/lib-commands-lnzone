package bittech.lib.commands.lnzone.internal;

import bittech.lib.protocol.Command;
import bittech.lib.protocol.common.NoDataResponse;
import bittech.lib.utils.Btc;

public class IncreaseZoneFeeDepositCommand extends Command<IncreaseZoneFeeDepositRequest, NoDataResponse> {

	public static IncreaseZoneFeeDepositCommand createStub() {
		return new IncreaseZoneFeeDepositCommand("", new Btc(""));
	}
	
	public IncreaseZoneFeeDepositCommand(String zoneChannelId, Btc amount) {
		this.request = new IncreaseZoneFeeDepositRequest(zoneChannelId, amount);
	}

}
