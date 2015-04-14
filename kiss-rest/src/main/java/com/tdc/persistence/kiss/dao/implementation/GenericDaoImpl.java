package com.tdc.persistence.kiss.dao.implementation;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import com.tdc.persistence.kiss.dao.interfaces.GenericDAO;


public abstract class GenericDaoImpl<T, I extends Serializable> implements
		GenericDAO<T, I> {

	
	private Class<T> type;

	protected EntityManager entityManager;

	public EntityManager getEntityManager() {
		return entityManager;
	}

	@PersistenceContext(unitName ="kiss-persistence-unit")
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public Class<T> getType() {
		return type;
	}

	public GenericDaoImpl() {
		this.type = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}

	@Transactional(readOnly = true)
	public T find(I id) {
		return (T) getEntityManager().getReference(getType(), id);
	}

	@Transactional
	public void delete(T obj) {
		getEntityManager().remove(obj);
	}

	@Transactional
	public void saveOrUpdate(T obj) {
		getEntityManager().merge(obj);
	}
	
	@Transactional
	public T save(T obj){
		return getEntityManager().merge(obj);
	}


}
