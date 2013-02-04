package com.example.xpnotesdojo.dao;

import java.util.List;


public interface IDao<E> {

	public E get(Long id);
	public E save(E entity);
	public E update(E entity);
	public void remove(Long id);
	public Long count();
	public Class<E> getPersistentClass();
	public List<E> list();
	
}
