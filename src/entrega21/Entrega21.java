/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entrega21;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author licontrex
 */
public class Entrega21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
               EntityManagerFactory emf;
        emf = Persistence.createEntityManagerFactory("Entrega2PU");
        EntityManager em;
        em = emf.createEntityManager();
        /*
            Hemos modelado dos entidades, una autor y otra articulos,
            Autor tiene tres tablas una Autor, una para la secuencia de la clave id,
            y otra la estructura Set.            
        */
        /*
            Para la clase Articulos hemos generado dos tablas, una tabla Articulos y otra debido a la relacion de articulos con autores una relacion de uno a muchos.
        */
        
        em.close();
        emf.close();
    }
    
}
