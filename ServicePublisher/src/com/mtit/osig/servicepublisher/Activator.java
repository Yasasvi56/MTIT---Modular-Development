package com.mtit.osig.servicepublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration webHostingServiceRegistration;
	ServiceRegistration networkServiceRegistration;
	ServiceRegistration dataStorageServiceRegistration;
	ServiceRegistration appSupportServiceRegistration;
	ServiceRegistration securityProtectionServiceRegistration;
	ServiceRegistration monitoringServiceRegistration;

	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("publisher has been started...");
		//web hosting
		ServiceWebHosting webHostingService = new ServiceWebHostingImpl();
		webHostingServiceRegistration = context.registerService(
				ServiceWebHosting.class.getName(), webHostingService, null);
		//network
		ServiceNetwork networkService = new ServiceNetworkImpl();
		networkServiceRegistration = context.registerService(
				ServiceNetwork.class.getName(), networkService, null);
		//data storage
		ServiceDataStorage dataStorageService = new ServiceDataStorageImpl();
		dataStorageServiceRegistration = context.registerService(
				ServiceDataStorage.class.getName(), dataStorageService, null);
		//application support
		ServiceApplicationSupport applicationSupportService = new ServiceApplicationSupportImpl();
		appSupportServiceRegistration = context.registerService(
				ServiceApplicationSupport.class.getName(), applicationSupportService, null);
		//security protection
		ServiceSecurityProtection securityProtectionService = new ServiceSecurityProtectionImpl();
		securityProtectionServiceRegistration = context.registerService(
				ServiceSecurityProtection.class.getName(), securityProtectionService, null);
		//monitoring management
		ServiceMonitoringManagement monitoringManagementService = new ServiceMonitoringManagementImpl();
		monitoringServiceRegistration = context.registerService(
				ServiceMonitoringManagement.class.getName(), monitoringManagementService, null);
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("publisher has been terminated...");
		//web hosting
		webHostingServiceRegistration.unregister();
		//network
		networkServiceRegistration.unregister();
		//data storage
		dataStorageServiceRegistration.unregister();
		//application support
		appSupportServiceRegistration.unregister();
		//security protection
		securityProtectionServiceRegistration.unregister();
		//monitoring management
		monitoringServiceRegistration.unregister();
		
	}

}
