
package mx.com.gm.sga.cliente.ciclovidaJPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import mx.com.gm.sga.domain.Persona;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class EliminarObjetoJPA {
    
    
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
        
        //PBKETO EN ESTADO DE DETACHED
        log.debug("Objeto Encontrado sin Actualizarse = " + persona1);
             
        /// ELIMINNDO OBJETO
        em.remove(persona1);
        
        //realiza cambios sin cerrar la transaccion
        // em.flush();
        tx.commit();
        
        // MOSTRAMOS LOS CAMBIOS
        log.debug("Objeto ELIMINADO = " + persona1);
        
        // CERRAMOS EL EMTITY MANAGER
        em.close();
    }
    
}
