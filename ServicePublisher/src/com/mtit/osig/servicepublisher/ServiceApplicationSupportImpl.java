package com.mtit.osig.servicepublisher;

public class ServiceApplicationSupportImpl implements ServiceApplicationSupport {

	@Override
	public String applicationSupportService(String subscriber) {
		String response = "Excute the application support service for : " + subscriber;
		response += "\n=============================================================";
		response += "\nNo of running applications : 10";
		response += "\nNo of stopped applications : 1";
		response += "\nLast hour reported cases count : 0";
		response += "\n";
		return response;
	}
	
}
