
package mx.com.gm.sga.cliente.ciclovidaJPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import mx.com.gm.sga.domain.Persona;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class ActualizarObjetoSesionLarga {
    
        static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("sgaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        
        
        //  INICIA LA TRANSACCION
        
        
        // PASO 1,INICIA TRANSACCION
        tx.begin();
        
        // PASO 2, EJECUTAMOS SQL de busqueda
        Persona persona1 = em.find(Persona.class, 4);
        log.debug("Objeto encontrado = " + persona1);
        
        //PASO 3  MODIFICAR EL OBJETO
        persona1.setEmail("gay@gmail.com");
        
        //PASO 4 TERMINA LA TRANSACCION
        tx.commit();
        
        // muestra obtejo modificado
        log.debug("Objeto actualizado con session larga = " + persona1);
      
        // CERRAMOS EL EMTITY MANAGER
        em.close();
    }
}
