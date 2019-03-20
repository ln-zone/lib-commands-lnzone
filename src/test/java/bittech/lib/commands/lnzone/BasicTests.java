package bittech.lib.commands.lnzone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import bittech.lib.commands.lnzone.EstablishedChannel;
import bittech.lib.utils.Btc;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class BasicTests extends TestCase {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(BasicTests.class);

	public BasicTests(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(BasicTests.class);
	}

	
	public void testCalcZoneFields() throws Exception {
		EstablishedChannel zcd = new EstablishedChannel();
		zcd.feeReserve = new Btc("0.00000095:865");
//		zcd.myAmount = 
	}
		
}
