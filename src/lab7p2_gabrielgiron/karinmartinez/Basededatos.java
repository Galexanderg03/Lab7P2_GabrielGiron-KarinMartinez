
package lab7p2_gabrielgiron.karinmartinez;

import java.util.ArrayList;

public class Basededatos {
    public ArrayList <Usuarios> usuario = new ArrayList();
    public ArrayList <Accesorio> accesorios = new ArrayList();
    private String Ingresado;
    public int factura=0;
    
    public Basededatos() {
    }

    public ArrayList<Accesorio> getAccesorios() {
        return accesorios;
    }

    public int getFactura() {
        return factura;
    }

    public void setFactura(int factura) {
        this.factura = factura;
    }
    
    public void setAccesorios(ArrayList<Accesorio> accesorios) {
        this.accesorios = accesorios;
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

    public String getIngresado() {
        return Ingresado;
    }

    public void setIngresado(String Ingresado) {
        this.Ingresado = Ingresado;
    }
    
    @Override
    public String toString() {
        return "Basededatos{" + "usuarios=" + usuario + '}';
    }
    
}
