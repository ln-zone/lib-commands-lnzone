package bittech.lib.commands.lnzone.commans;

import java.math.BigDecimal;

import bittech.lib.utils.Btc;

public class Offer {
	
	public static final int blocksPerYear = 52560;

	/** Ile kasy bierzemy za każde zroutowanie płatności */
	public Btc feeBase = new Btc();
	
	/** Ile kasy dodatkowo za każdy satoshi w zrutowanej płatności */
	public Btc feePerSatoshi = new Btc();
	
	/** Jaką część funduszy zablokowanych po naszej stronie będzie musiał opłacić
	 za ta blokadę na każde 52560 bloków (około rok) */
	public BigDecimal fundsAllocationFee;
	
	/** Stały koszt (np. za otwarcie/zamknięcie kanału) */
	public Btc fixedCost = new Btc();
	
	
	public Offer() {

	}

}
