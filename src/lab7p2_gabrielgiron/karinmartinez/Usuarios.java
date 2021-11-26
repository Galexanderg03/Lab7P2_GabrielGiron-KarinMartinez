
package lab7p2_gabrielgiron.karinmartinez;

public class Usuarios {
    public String nombre,usuario, contraseña,tipo;
    public int edad;

    public Usuarios() {
    }

    public Usuarios(String nombre, String usuario, String contraseña, String tipo, int edad) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.tipo = tipo;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return nombre ;
    }
    
    
}
