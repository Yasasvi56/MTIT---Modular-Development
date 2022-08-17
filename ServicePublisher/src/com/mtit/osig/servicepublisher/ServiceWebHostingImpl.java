package com.mtit.osig.servicepublisher;

public class ServiceWebHostingImpl implements ServiceWebHosting {

	@Override
	public String webHostingService(String subscriber) {
		String response = "Excute the web hosting service for : " + subscriber;
		response += "\n=============================================================";
		response += "\nNo of hosting spaces : 3";
		response += "\nTotal storage : 200TB";
		response += "\nNo of running hosts : 6";
		response += "\nNo of terminated hosts : 2";
		response += "\n";
		return response;
	}
	
}
