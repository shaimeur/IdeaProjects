package edu.mum.cs;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FirstLevelCacheMain {

    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("edu.mum.cs");


    // Insert may be held in cache
    private void persist() {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        //Person p = new Person("Saad","Haimeur");
        Book book = new Book("111", "Hibernate");
        System.out.println("1--------------------");
        // em.persist(p);
        em.persist(book);
        System.out.println("2--------------------");

        em.getTransaction().commit();
        System.out.println("3--------------------");

        em.close();
    }

    private void retrieval() {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();


        Book book = new Book("111", "Hibernate");
        System.out.println("1--------------------");

        em.persist(book);
        System.out.println("2--------------------");
        Book book2 = em.find(Book.class, "111");
        System.out.println("3--------------------" + book2.getTitle());
        em.getTransaction().commit();
        System.out.println("4--------------------");

        em.close();
    }


    public static void main(String[] args) {
        FirstLevelCacheMain main = new FirstLevelCacheMain();
        //main.persist();
        main.retrieval();
        emf.close();
    }
}
