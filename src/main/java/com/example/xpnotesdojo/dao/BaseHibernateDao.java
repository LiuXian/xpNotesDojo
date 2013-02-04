package com.example.xpnotesdojo.dao;

import java.lang.reflect.Type;
import java.util.List;

import com.britesnow.snow.web.db.hibernate.HibernateDaoHelper;
import com.google.inject.Inject;
import com.googlecode.gentyref.GenericTypeReflector;

@SuppressWarnings({"unchecked"})
public class BaseHibernateDao<E> implements IDao<E> {
	
	protected Class<E> persistentClass;
	protected HibernateDaoHelper daoHelper;

	public BaseHibernateDao() {
		Type persistentType = GenericTypeReflector.getTypeParameter(getClass(), BaseHibernateDao.class.getTypeParameters()[0]);
		if (persistentType instanceof Class) {
			this.persistentClass = (Class<E>) persistentType;
		} 
	}

	@Inject
	public void injectDaoHelper(HibernateDaoHelper daoHelper) {
		this.daoHelper = daoHelper;
	}

	@Override
	public E get(Long id) {
		return daoHelper.get(persistentClass, id);
	}

	public E save(E entity) {
		return daoHelper.save(entity);
	}

	@Override
	public E update(E entity) {
		return daoHelper.update(entity);
	}

	@Override
	public void remove(Long id) {
		daoHelper.delete(persistentClass, id);
	}

	@Override
	public Long count() {
		return null;
	}
	
	@Override
	public Class<E> getPersistentClass() {
		return persistentClass;
	}

	@Override
	public List<E> list() {
		return null;
	}

}
