package com.mtit.osgi.servicesubscriberb;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import com.mtit.osig.servicepublisher.ServiceApplicationSupport;
import com.mtit.osig.servicepublisher.ServiceDataStorage;
import com.mtit.osig.servicepublisher.ServiceMonitoringManagement;
import com.mtit.osig.servicepublisher.ServiceNetwork;
import com.mtit.osig.servicepublisher.ServiceSecurityProtection;
import com.mtit.osig.servicepublisher.ServiceWebHosting;

public class Activator implements BundleActivator {

	
	String subscriber = "Subscriber B";

	ServiceReference serviceRefWebHosting;
	ServiceReference serviceRefDataStorage;

	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println(subscriber+" service has been started...");
		//web hosting
		serviceRefWebHosting = context.getServiceReference(ServiceWebHosting.class.getName());
		ServiceWebHosting serviceWebHosting = (ServiceWebHosting)context.
				getService(serviceRefWebHosting);
		System.out.println(serviceWebHosting.webHostingService(subscriber));
		//data storage
		serviceRefDataStorage = context.getServiceReference(ServiceDataStorage.class.getName());
		ServiceDataStorage serviceDataStorage = (ServiceDataStorage)context.
				getService(serviceRefDataStorage);
		System.out.println(serviceDataStorage.dataStorageService(subscriber));
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println(subscriber+" has been terminated...");
		//web hosting
		context.ungetService(serviceRefWebHosting);
		//data storage
		context.ungetService(serviceRefDataStorage);
	}

}
