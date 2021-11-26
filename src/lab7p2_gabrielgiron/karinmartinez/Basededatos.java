
package lab7p2_gabrielgiron.karinmartinez;

import java.util.ArrayList;

public class Basededatos {
    public ArrayList <Usuarios> usuario = new ArrayList();

    public Basededatos() {
    }

    public ArrayList<Usuarios> getUsuario() {
        return usuario;
    }

    public void setUsuario(ArrayList<Usuarios> usuario) {
        this.usuario = usuario;
    }

    public void addUsuario(Usuarios usuario){ 
        this.usuario.add(usuario); 
    }
    
    @Override
    public String toString() {
        return "Basededatos{" + "usuarios=" + usuario + '}';
    }
    
}
