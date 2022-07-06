package edu.mum.cs;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RemoveTestMain {
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("edu.mum.cs");

    private void removeTransientObject() {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        // 1. Remove transient object - assigned primary key

      /*  Book b1 = new Book("111-222-333", "Hibernate");
        em.remove(b1);*/
        // 1. Remove transient object - autogenerated primary key
        //   Person p1 = new Person("saad", "haimeur");
        // em.remove(p1);

        em.getTransaction().commit();
        em.close();

    }

    private void removeDetachedObject() {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Person p1 = new Person("saad", "haimeur");
        em.persist(p1);
        em.detach(p1);
        em.remove(p1);

        em.getTransaction().commit();
        em.close();
    }

    private void removeManagedObject() {

        persist();
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

       /* Person p = em.find(Person.class, 1L);
        em.remove(p);*/

       /* Person p = em.getReference(Person.class, 1L);
        em.remove(p);*/
        System.out.println("1................................;");
        Book b = em.getReference(Book.class,"111-222");
        System.out.println("2................................;");

        em.remove(b);
        System.out.println("3................................;");


        em.getTransaction().commit();
        System.out.println("4................................;");

        em.close();

    }

    private void persist() {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Person p1 = new Person("saad", "haimeur");
        em.persist(p1);

        Book b = new Book("111-222","Hibernate");
        em.persist(b);

        em.getTransaction().commit();
        em.close();
    }

    public static void main(String[] args) {

        RemoveTestMain main = new RemoveTestMain();
        // main.removeTransientObject();
        // main.removeDetachedObject();
        main.removeManagedObject();
        emf.close();

    }
}
