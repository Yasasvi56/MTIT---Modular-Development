package com.mtit.osig.servicepublisher;

public class ServiceMonitoringManagementImpl implements ServiceMonitoringManagement {

	@Override
	public String monitoringManagementService(String subscriber) {
		String response = "Excute the monitoring management service for : " + subscriber;
		response += "\n=============================================================";
		response += "\nNo of application errors(Last hour) : 2";
		response += "\nNo of database errors(Last hour) : 0";
		response += "\nNo of api errors(Last hour) : 2";
		response += "\nNo of reported jira cases(Last hour) : 1";
		response += "\n";
		return response;
	}
	
}
