package com.tdc.component.bean;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.search.jpa.FullTextEntityManager;
import org.hibernate.search.query.dsl.QueryBuilder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class SearchEntityBean {
	
	protected EntityManager entityManager;

	public EntityManager getEntityManager() {
		return entityManager;
	}

	@PersistenceContext(unitName ="ams-persistence-unit")
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly=true)
	public <T> List<T> hibernatesearch(String field, String fieldValue,
			Class<T> clazz) {

		List<T> result = null;

		FullTextEntityManager fullTextEntityManager = org.hibernate.search.jpa.Search
				.getFullTextEntityManager(entityManager);

		try {


			QueryBuilder qb = fullTextEntityManager.getSearchFactory()
					.buildQueryBuilder().forEntity(clazz).get();
			org.apache.lucene.search.Query query = qb.keyword().onFields(field)
					.matching(fieldValue).createQuery();
			

			// wrap Lucene query in a javax.persistence.Query
			javax.persistence.Query persistenceQuery = fullTextEntityManager
					.createFullTextQuery(query, clazz);
			persistenceQuery.setMaxResults(10);

			// execute search
			result = persistenceQuery.getResultList();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}
}