package com.mtit.osgi.servicesubscribera;

import com.mtit.osig.servicepublisher.ServiceApplicationSupport;
import com.mtit.osig.servicepublisher.ServiceDataStorage;
import com.mtit.osig.servicepublisher.ServiceMonitoringManagement;
import com.mtit.osig.servicepublisher.ServiceNetwork;
import com.mtit.osig.servicepublisher.ServiceSecurityProtection;
import com.mtit.osig.servicepublisher.ServiceWebHosting;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

public class Activator implements BundleActivator {

	String subscriber = "Subscriber A";
	
	ServiceReference serviceRefWebHosting;
	ServiceReference serviceRefNetwork;
	ServiceReference serviceRefDataStorage;
	ServiceReference serviceRefAppSupport;
	ServiceReference serviceRefProtection;
	ServiceReference serviceRefMonitoring;

	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println(subscriber+" service has been started...");
		//web hosting
		serviceRefWebHosting = context.getServiceReference(ServiceWebHosting.class.getName());
		ServiceWebHosting serviceWebHosting = (ServiceWebHosting)context.
				getService(serviceRefWebHosting);
		System.out.println(serviceWebHosting.webHostingService(subscriber));
		//network
		serviceRefNetwork = context.getServiceReference(ServiceNetwork.class.getName());
		ServiceNetwork serviceNetwork = (ServiceNetwork)context.
				getService(serviceRefNetwork);
		System.out.println(serviceNetwork.networkService(subscriber));
		//data storage
		serviceRefDataStorage = context.getServiceReference(ServiceDataStorage.class.getName());
		ServiceDataStorage serviceDataStorage = (ServiceDataStorage)context.
				getService(serviceRefDataStorage);
		System.out.println(serviceDataStorage.dataStorageService(subscriber));
		//application support
		serviceRefAppSupport = context.getServiceReference(ServiceApplicationSupport.class.getName());
		ServiceApplicationSupport serviceAppSupport = (ServiceApplicationSupport)context.
				getService(serviceRefAppSupport);
		System.out.println(serviceAppSupport.applicationSupportService(subscriber));
		//security protection
		serviceRefProtection = context.getServiceReference(ServiceSecurityProtection.class.getName());
		ServiceSecurityProtection serviceProtection = (ServiceSecurityProtection)context.
				getService(serviceRefProtection);
		System.out.println(serviceProtection.securityProtectionService(subscriber));
		//Monitoring Management
		serviceRefMonitoring = context.getServiceReference(ServiceMonitoringManagement.class.getName());
		ServiceMonitoringManagement serviceMonitoringManagement = (ServiceMonitoringManagement)context.
				getService(serviceRefMonitoring);
		System.out.println(serviceMonitoringManagement.monitoringManagementService(subscriber));
		
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println(subscriber+" has been terminated...");
		//web hosting
		context.ungetService(serviceRefWebHosting);
		//network
		context.ungetService(serviceRefNetwork);
		//data storage
		context.ungetService(serviceRefDataStorage);
		//app support
		context.ungetService(serviceRefAppSupport);
		//security protection
		context.ungetService(serviceRefProtection);
		//monitoring management
		context.ungetService(serviceRefMonitoring);
	}

}
