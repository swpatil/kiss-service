package com.tdc.component.bean;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.search.jpa.FullTextEntityManager;
import org.hibernate.search.query.dsl.QueryBuilder;
import org.springframework.stereotype.Component;

import com.tdc.persistence.dao.entity.Cableunit;

@Component
public class SearchEntityBean {

	@SuppressWarnings("unchecked")
	public <T> List<T> hibernatesearch(String field, String fieldValue,
			Class<T> clazz) {

		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("kiss-persistence-unit");
		EntityManager em = factory.createEntityManager();
		List<T> result = null;

		FullTextEntityManager fullTextEntityManager = org.hibernate.search.jpa.Search
				.getFullTextEntityManager(em);

		try {

			em.getTransaction().begin();

			QueryBuilder qb = fullTextEntityManager.getSearchFactory()
					.buildQueryBuilder().forEntity(Cableunit.class).get();
			org.apache.lucene.search.Query query = qb.keyword().onFields(field)
					.matching(fieldValue).createQuery();

			// wrap Lucene query in a javax.persistence.Query
			javax.persistence.Query persistenceQuery = fullTextEntityManager
					.createFullTextQuery(query, clazz);

			// execute search
			result = persistenceQuery.getResultList();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally {
			em.getTransaction().commit();
			em.close();
		}

		return result;
	}
}