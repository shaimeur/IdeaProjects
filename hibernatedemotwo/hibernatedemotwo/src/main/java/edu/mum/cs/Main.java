package edu.mum.cs;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args){
       EntityManagerFactory emf =  Persistence.createEntityManagerFactory("edu.mum.cs");
        EntityManager em = emf.createEntityManager();

        Person p = new Person("saad","haimeur");
        em.getTransaction().begin();

        System.out.println("1----------------");
        em.persist(p);
        System.out.println(p);

        System.out.println("2----------------");
        p.setFirstName("red");
        p.setLastName("mew");

        System.out.println("3----------------");

        em.getTransaction().commit();

        System.out.println("4----------------");

        em.close();
        emf.close();

     System.out.println("5----------------");

    }
}
