package bittech.lib.commands.lnzone.external;

import bittech.lib.protocol.Request;
import bittech.lib.utils.Btc;
import bittech.lib.utils.Require;

public class ToOnchainRequest implements Request {
	
	public final String zoneChannelId;
	public final String addr;
	public final Btc amount;

	public ToOnchainRequest(final String zoneChannelId, final Btc amount, final String addr) {
		this.zoneChannelId = Require.notNull(zoneChannelId, "zoneChannelId");
		this.amount = Require.notNull(amount, "amount");
		this.addr = Require.notNull(addr, "addr");
	}

}
