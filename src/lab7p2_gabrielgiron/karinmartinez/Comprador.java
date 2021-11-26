
package lab7p2_gabrielgiron.karinmartinez;

public class Comprador extends Usuarios {
    public int dinero;

    public Comprador() {
        super();
    }

    public Comprador(int dinero, String nombre, String usuario, String contraseña, String tipo, int edad) {
        super(nombre, usuario, contraseña, tipo, edad);
        this.dinero = dinero;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return "Comprador{" + "dinero=" + dinero + '}';
    }
    
    
}
