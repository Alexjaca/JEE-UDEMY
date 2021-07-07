
package Beans;

import javax.ejb.Remote;

@Remote
public interface HolaMundoEjbRemote {
    public int Sumar (int a, int b);
    
}
