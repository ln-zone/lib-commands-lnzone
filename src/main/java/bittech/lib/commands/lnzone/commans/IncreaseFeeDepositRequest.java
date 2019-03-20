package bittech.lib.commands.lnzone.commans;

import bittech.lib.protocol.Request;
import bittech.lib.utils.Btc;
import bittech.lib.utils.Require;

public class IncreaseFeeDepositRequest implements Request {
	
	public final String zoneChannelId;
	public final Btc amount;

	public IncreaseFeeDepositRequest(String zoneChannelId, Btc amount) {
		this.zoneChannelId = Require.notNull(zoneChannelId, "zoneChannelId");
		this.amount = Require.notNull(amount, "amount");
	}

}
