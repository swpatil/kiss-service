package com.tdc.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.search.jpa.FullTextEntityManager;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class IndexProcessor implements BeanFactoryPostProcessor {

	public void postProcessBeanFactory(ConfigurableListableBeanFactory arg0)
			throws BeansException {
		// TODO Auto-generated method stub

		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("kiss-persistence-unit");
		EntityManager em = factory.createEntityManager();

		FullTextEntityManager fullTextEntityManager = org.hibernate.search.jpa.Search
				.getFullTextEntityManager(em);

		try {

			fullTextEntityManager.createIndexer().startAndWait();
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}finally{
			fullTextEntityManager.close();
		}

	}

}
