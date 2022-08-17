package com.mtit.osig.servicepublisher;

public class ServiceSecurityProtectionImpl implements ServiceSecurityProtection {

	@Override
	public String securityProtectionService(String subscriber) {
		String response = "Excute the security protection service for : " + subscriber;
		response += "\n=============================================================";
		response += "\nUnauthorized access trys : 1";
		response += "\nDDOS count : 0";
		response += "\nMalware count : 0";
		response += "\nLast virus scan : 2022.03.10";
		response += "\n";
		return response;
	}
	
}
