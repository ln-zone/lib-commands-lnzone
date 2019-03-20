package bittech.lib.commands.lnzone.external;

import bittech.lib.protocol.Response;
import bittech.lib.utils.Require;

public class ToOnchainResponse implements Response {
	
	public final String invoiceBolt11;

	public ToOnchainResponse(final String invoiceBolt11) {
		this.invoiceBolt11 = Require.notNull(invoiceBolt11, "invoiceBolt11");
	}

}
