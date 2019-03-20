package bittech.lib.commands.lnzone.internal;

import bittech.lib.protocol.Response;
import bittech.lib.utils.Require;

public class RebalanceToOnchainResponse implements Response {
	
	public final String addr;

	public RebalanceToOnchainResponse(final String addr) {
		this.addr = Require.notNull(addr, "addr");
	}

}
