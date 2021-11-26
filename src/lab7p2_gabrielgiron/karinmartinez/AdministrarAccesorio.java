/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_gabrielgiron.karinmartinez;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Galex
 */
public class AdministrarAccesorio {
    private ArrayList<Accesorio> ListaAccess;
    private File archivo = null;
    
    public AdministrarAccesorio(String path) 
    {
        archivo = new File(path);
    }

    public ArrayList<Accesorio> getListaAccess() {
        return ListaAccess;
    }

    public void setListaAccess(ArrayList<Accesorio> ListaAccess) {
        this.ListaAccess = ListaAccess;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "AdministrarAccesorio{" + "ListaAccess=" + ListaAccess + ", archivo=" + archivo + '}';
    }
    
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Accesorio A : ListaAccess) {
                bw.write(A.getNombre() + ";");
                bw.write(A.getID() + ";");
                bw.write(A.getCantidad() + ";");
                bw.write(A.getPrecio()+";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }
    
    public void cargarArchivo() {
        Scanner sc = null;
        ListaAccess = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    ListaAccess.add(new Accesorio(sc.next(),sc.nextInt(),sc.nextInt()));
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
    
}
