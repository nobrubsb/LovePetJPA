
package br.com.petlove.teste;

import br.com.petlove.modelo.Estado;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class TesteAlterarEstado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PetLovePU");
        EntityManager em = emf.createEntityManager();
        Estado e = em.find(Estado.class, 29);
        e.setUf_estado("AT");
        e.setNome("Alterei o nome");
        em.getTransaction().begin();
        em.merge(e);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
    
}
