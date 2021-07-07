
package mx.com.gm.sga.cliente.ciclovidaJPA;

import javax.persistence.*;
import javax.persistence.Persistence;
import mx.com.gm.sga.domain.Persona;
import org.apache.logging.log4j.*;

public class PersistirObjetoJPA {
    
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("sgaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        
        
        //  INICIA LA TRANSACCION
        
        // 1 PASO, CREAN NUEVO OBJETO
        //EL OBJETO ESTA EN ESTADO TRANSITIVO
        Persona persona1 = new Persona("pedro", "Gonzalez", "pedrogaonzalez@gmail.com", "777777");
        
        // PASO 2,INICIA TRANSACCION
        tx.begin();
        
        // PASO 3, EJECUTAMOS SQL
        em.persist(persona1);
        log.debug("Objeto sin persistir = " + persona1);
        
        // PASO 4, COMIT / ROOLBACK (OBJETO INGRESADO A LA BD)
        tx.commit();
        
        //OBJETO EN ESTADO DE DETACHED
        log.debug("Objeto persistido - en estado de detached " + persona1);
        
        // CERRAMOS EL EMTITY MANAGER
        em.close();
        
    }
    
}
