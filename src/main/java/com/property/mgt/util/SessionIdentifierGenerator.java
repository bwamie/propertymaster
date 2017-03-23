package com.property.mgt.util;

import java.security.SecureRandom;
import java.math.BigInteger;

public final class SessionIdentifierGenerator {
	private SecureRandom random = new SecureRandom();
	public String nextSessionId() {
		return new BigInteger(130, random).toString(32);
	}
	
	public static String getRandomString(){
		SessionIdentifierGenerator sg = new SessionIdentifierGenerator();
		return sg.nextSessionId();
	}
}