package com.mtit.osig.servicepublisher;

public class ServiceDataStorageImpl implements ServiceDataStorage {

	@Override
	public String dataStorageService(String subscriber) {
		String response = "Excute the data storage service for : " + subscriber;
		response += "\n=============================================================";
		response += "\nNo of running databases : 5";
		response += "\nNo of terminated databases : 1";
		response += "\nIdentified error count in last hour : 0";
		response += "\n";
		return response;
	}
	
}
