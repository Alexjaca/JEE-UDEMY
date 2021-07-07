
package mx.com.gm.sga.domain;

import java.io.Serializable;


public class Persona implements Serializable{
    
    private static final long serialVersionUID = 1;
    private int id;
    private String Nombre;
    private String Apelido;
    private String Email;
    private String Telefono;

    public Persona() {
    }

    public Persona(int id, String Nombre, String Apelido, String Email, String Telefono) {
        this.id = id;
        this.Nombre = Nombre;
        this.Apelido = Apelido;
        this.Email = Email;
        this.Telefono = Telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApelido() {
        return Apelido;
    }

    public void setApelido(String Apelido) {
        this.Apelido = Apelido;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", Nombre=" + Nombre + ", Apelido=" + Apelido + ", Email=" + Email + ", Telefono=" + Telefono + '}';
    }

   
    
    
    
    
}
