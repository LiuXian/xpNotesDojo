package com.example.xpnotesdojo.dao;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.google.inject.Injector;
import com.google.inject.Singleton;
import com.metapossum.utils.scanner.reflect.ClassesInPackageScanner;

@SuppressWarnings({"unchecked","rawtypes"})
@Singleton
public class DaoRegistry {

	private Map<String, IDao>    daoByEntityClassName   = new HashMap<String, IDao>();
	private Map<String, Class>   entityClassByClassName = new HashMap<String, Class>();

	public void init(Injector injector,Class[] entityClasses) {
		try {
			Set<Class<? extends BaseHibernateDao>> daoClasses = new ClassesInPackageScanner().findSubclasses("com.example.xpnotesdojo.dao", BaseHibernateDao.class);
            
			daoClasses.remove(BaseHibernateDao.class);
			daoClasses.remove(GenericDao.class);
            
			for (Class daoClass : daoClasses) {
				if (daoClass != BaseHibernateDao.class){
					IDao dao = (IDao) injector.getInstance(daoClass);
					Class entityClass = dao.getPersistentClass();
					entityClassByClassName.put(entityClass.getSimpleName(), entityClass);
					daoByEntityClassName.put(entityClass.getSimpleName(), dao);
				}
			}
            
		} catch (IOException e) {
			e.printStackTrace();
		}
        
	}

	public IDao getDao(String entityClassName) {
		return daoByEntityClassName.get(entityClassName);
	}

	public Object getEntityInstance(String entityClassName) {
		try {
			return entityClassByClassName.get(entityClassName).newInstance();
		} catch (Exception e) {
			throw new RuntimeException("Can't create entityInstance for : " + entityClassName);
		}
	}
    
}
