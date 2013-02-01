package com.example.xpnotesdojo;

import java.io.IOException;
import java.util.Set;

import com.britesnow.snow.web.binding.EntityClasses;
import com.example.xpnotesdojo.entity.User;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.metapossum.utils.scanner.reflect.ClassesInPackageScanner;

public class XpNotesDojoConfig extends AbstractModule {
    
    @Override
    protected void configure() {
        
    }
    
    
    @SuppressWarnings("rawtypes")
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
