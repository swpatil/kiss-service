package com.tdc.util;


public class TestJPA {
	
	/*private EntityManager manager;
	 
    public TestJPA(EntityManager manager) {
        this.manager = manager;
    }

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
                .createEntityManagerFactory("kissPU");
        EntityManager manager = factory.createEntityManager();
        TestJPA test = new TestJPA(manager);
 
        test.listCU(manager);
 
        System.out.println(".. done");

	}
	
	 private void listCU(EntityManager em) {
		 
	        FullTextEntityManager fullTextEntityManager = org.hibernate.search.jpa.Search
	                .getFullTextEntityManager(em);
	 
	        try {
	            fullTextEntityManager.createIndexer().startAndWait();
	        } catch (InterruptedException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	 
	        em.getTransaction().begin();
	 
	        QueryBuilder qb = fullTextEntityManager.getSearchFactory()
	                .buildQueryBuilder().forEntity(Cableunit.class).get();
	        org.apache.lucene.search.Query query = qb.keyword().onFields("anlAnlaegsnavn")
	                .matching("Test").createQuery();
	 
	        // wrap Lucene query in a javax.persistence.Query
	        javax.persistence.Query persistenceQuery = fullTextEntityManager
	                .createFullTextQuery(query, Cableunit.class);
	 
	        // execute search
	        List<Cableunit> result = persistenceQuery.getResultList();
	        System.out.println("num of CUS:" + result);
	        for (Cableunit next : result) {
	            System.out.println("next cus: " + next.getAnlAnlaegsnavn());
	        }
	        em.getTransaction().commit();
	        em.close();
	 
	    }
*/
}
