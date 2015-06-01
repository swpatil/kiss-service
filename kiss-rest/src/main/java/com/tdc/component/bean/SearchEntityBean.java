package com.tdc.component.bean;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.search.jpa.FullTextEntityManager;
import org.hibernate.search.query.dsl.QueryBuilder;
import org.hibernate.search.query.dsl.TermMatchingContext;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.tdc.persistence.ams.dao.entity.Streets;
import com.tdc.persistence.kiss.dao.entity.Address;
import com.tdc.persistence.kiss.dao.entity.Cableunit;

@Component
public class SearchEntityBean {

	protected EntityManager entityManager;

	public EntityManager getEntityManager() {
		return entityManager;
	}

	@PersistenceContext(unitName = "ams-persistence-unit")
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public Map<String, List<? extends Serializable>> searchGlobalValues(String[] fields,
			String fieldValue) {

		Map<String, List<? extends Serializable>> entitySearchMap = Collections.EMPTY_MAP;

		for (Class<? extends Serializable> entity : Arrays.asList(
				Address.class, Cableunit.class,Streets.class)) {
			
			/*if(entity.getName().equals(Address.class.getName())){
				entitySearchMap.put(entity.getName(),
						(List<T>) hibernatesearch(new String[]{fields[0],fields[1]}, fieldValue, entity));
				
			}else */if(entity.getName().equals(Cableunit.class.getName())){
				entitySearchMap.put(entity.getName(),
						(List<Cableunit>) hibernatesearch(new String[]{fields[2],fields[3]}, fieldValue, entity));
				
			}else if(entity.getName().equals(Streets.class.getName())){
				entitySearchMap.put(entity.getName(),
						(List<Streets>) hibernatesearch(new String[]{fields[0],fields[1]}, fieldValue, entity));
				
			}
			
			
			
		}

		return entitySearchMap;

	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public <T> List<T> hibernatesearch(String[] fields, String fieldValue,
			Class<T> clazz) {

		List<T> result = null;

		FullTextEntityManager fullTextEntityManager = org.hibernate.search.jpa.Search
				.getFullTextEntityManager(entityManager);

		try {

			QueryBuilder qb = fullTextEntityManager.getSearchFactory()
					.buildQueryBuilder().forEntity(clazz).get();

			/*
			 * org.apache.lucene.search.Query query =
			 * qb.keyword().wildcard().onField("").andField("")
			 * .matching(fieldValue).createQuery();
			 */

			TermMatchingContext termMatching = qb.keyword().wildcard()
					.onField(fields[0]);
			for (int i = 1; i < fields.length; i++) {
				termMatching.andField(fields[i]);
			}
			org.apache.lucene.search.Query query = termMatching.matching(
					fieldValue + "*").createQuery();
			// wrap Lucene query in a javax.persistence.Query
			javax.persistence.Query persistenceQuery = fullTextEntityManager
					.createFullTextQuery(query, clazz);
			persistenceQuery.setMaxResults(20);

			// execute search
			result = persistenceQuery.getResultList();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}
}