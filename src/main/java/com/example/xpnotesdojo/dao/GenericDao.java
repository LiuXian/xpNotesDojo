package com.example.xpnotesdojo.dao;

import com.example.xpnotesdojo.entity.BaseEntity;


@SuppressWarnings({"rawtypes","unchecked"})
public class GenericDao extends BaseHibernateDao<BaseEntity> {

	public void setPersistentClass(Class persitentClass) {
		this.persistentClass = persitentClass;
	}
	
}
