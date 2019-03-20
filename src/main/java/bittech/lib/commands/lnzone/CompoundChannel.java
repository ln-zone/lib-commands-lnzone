package bittech.lib.commands.lnzone;

import bittech.lib.utils.Btc;

public class CompoundChannel {
	
	public static enum Type {BASIC, ZONE}
	
	public Type type;
	public String name;
	public String status;
	public String shortChannelId;
	
	public Btc myAmount;
	public Btc peerAmount;
	public Btc capacity;
	
	public String peerId;
	public String peerAlias;
	public String fundingTxId;
	
	public EstablishedChannel zoneChannelData;

}
