package bittech.lib.commands.lnzone.internal;

import bittech.lib.protocol.Request;
import bittech.lib.utils.Btc;
import bittech.lib.utils.Require;

public class RebalanceToOnchainRequest implements Request {
	
	public final String zoneChannelId;
	public final Btc amount;

	public RebalanceToOnchainRequest(final String zoneChannelId, final Btc amount) {
		this.zoneChannelId = Require.notNull(zoneChannelId, "zoneChannelId");
		this.amount = Require.notNull(amount, "amount");
	}

}
