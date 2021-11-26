/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_gabrielgiron.karinmartinez;
import java.util.Random;
/**
 *
 * @author Galex
 */
public class Accesorio {
    
    private String Nombre;
    private int cantidad;
    private long precio;
    private long ID;
    private Random R = new Random();

    public Accesorio(String Nombre, int cantidad, int precio) {
        crearID();
        this.Nombre = Nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public long getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }
    
    private long crearID()
    {
        int num;
        for(int i = 0; i < 8; i++)
        {
            num = R.nextInt(9);
            ID = ID + num;
        }
        return ID;
    }

    @Override
    public String toString() {
        return "Accesorio{" + "Nombre=" + Nombre + ", cantidad=" + cantidad + ", precio=" + precio + ", ID=" + ID + '}';
    }
}
