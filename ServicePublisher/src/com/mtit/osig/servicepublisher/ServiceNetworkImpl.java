package com.mtit.osig.servicepublisher;

public class ServiceNetworkImpl implements ServiceNetwork {

	@Override
	public String networkService(String subscriber) {
		String response = "Excute the network service for : " + subscriber;
		response += "\n=============================================================";
		response += "\nSpeed : 100Mbps";
		response += "\nReported error count(Last hour) : 2";
		response += "\nTimeouts : 5";
		response += "\nUnauthorized access trys : 1";
		response += "\nFirewall status : 100%";
		response += "\n";
		return response;
	}
	
}
