package com.example.xpnotesdojo;

import java.io.IOException;
import java.util.Set;

import com.britesnow.snow.web.auth.AuthRequest;
import com.britesnow.snow.web.binding.EntityClasses;
import com.example.xpnotesdojo.dao.DaoRegistry;
import com.example.xpnotesdojo.entity.User;
import com.example.xpnotesdojo.web.AppAuthRequest;
import com.google.inject.AbstractModule;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.metapossum.utils.scanner.reflect.ClassesInPackageScanner;

public class XpNotesDojoConfig extends AbstractModule {
    
    @Override
    protected void configure() {
    	bind(AuthRequest.class).to(AppAuthRequest.class);
    }
    
    @Provides
    @Singleton
    @Inject
    public DaoRegistry providesDaoRegistry(Injector injector, @EntityClasses Class[] entityClasses ){
    	DaoRegistry daoRegistry = new DaoRegistry();
    	daoRegistry.init(injector, entityClasses);
    	return daoRegistry;
    }
    
    @Provides
    @Singleton
    @EntityClasses
    public Class[] provideEntityClasses() {
    	Set<Class<?>> entitySet;
    	try {
    		entitySet = new ClassesInPackageScanner().findAnnotatedClasses(User.class.getPackage().getName(), javax.persistence.Entity.class);
    		Class[] entityClasses = new Class[entitySet.size()];
    		entitySet.toArray(entityClasses);
    		return entityClasses;
    	} catch (IOException e) {
    		throw new RuntimeException("Cannot get all the enity class: " + e.getMessage());
    	}

    }
  
    
}
