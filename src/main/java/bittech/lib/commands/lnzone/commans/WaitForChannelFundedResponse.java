package bittech.lib.commands.lnzone.commans;

import bittech.lib.protocol.Response;
import bittech.lib.utils.Require;

public class WaitForChannelFundedResponse implements Response {
	
	public String fundedTxId;

	public WaitForChannelFundedResponse(String fundedTxId) {
		this.fundedTxId = Require.notNull(fundedTxId, "fundedTxId");
	}
}
