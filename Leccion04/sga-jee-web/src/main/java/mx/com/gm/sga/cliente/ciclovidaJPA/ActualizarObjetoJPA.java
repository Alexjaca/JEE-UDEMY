
package mx.com.gm.sga.cliente.ciclovidaJPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import mx.com.gm.sga.domain.Persona;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ActualizarObjetoJPA {
    
       static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("sgaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        
        
        //  INICIA LA TRANSACCION
        
        
        // PASO 1,INICIA TRANSACCION
        tx.begin();
        
        // PASO 2, EJECUTAMOS SQL de busqueda
        Persona persona1 = em.find(Persona.class, 2);
        
        // PASO 3, COMIT / ROOLBACK (OBJETO BUSCADO EN LA BD)
        tx.commit();
        
        //PBKETO EN ESTADO DE DETACHED
        log.debug("Objeto Encontrado sin Actualizarse = " + persona1);
        
        //ACTUALIZANDO OBJETO INGRESANDO LOS NUEVOS CAMBIOS
        persona1.setNombre("Nelbyta");
        persona1.setApellido("Gomezzzz");
        
        
        //CREAMOS UNA NUEVA TRANSACCION
        EntityTransaction tx2 = em.getTransaction();
        tx2.begin();
        
        /// ACTUALIZAMOS LOS DATOS INGRESADOS
        em.merge(persona1);
        
        //realiza cambios sin cerrar la transaccion
        // em.flush();
        
        // OBJETO ACTUALIZADO en estado de editach
        tx2.commit();
        
        // MOSTRAMOS LOS CAMBIOS
        log.debug("Objeto Actualizado = " + persona1);
        
        // CERRAMOS EL EMTITY MANAGER
        em.close();
    }
    
}
