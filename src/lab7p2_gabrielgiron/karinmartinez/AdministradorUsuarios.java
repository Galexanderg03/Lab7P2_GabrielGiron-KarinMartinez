/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_gabrielgiron.karinmartinez;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Galex
 */
public class AdministradorUsuarios {
    private ArrayList<Usuarios> ListaUsuarios = new ArrayList();
    private File archivo = null;
    
    public AdministradorUsuarios(String path) 
    {
        archivo = new File(path);
    }

    public ArrayList<Usuarios> getListaAccess() {
        return ListaUsuarios;
    }

    public void setListaAccess(ArrayList<Usuarios> ListaUsuarios) {
        this.ListaUsuarios = ListaUsuarios;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "AdministrarAccesorio{" + "ListaUsuario=" + ListaUsuarios + ", archivo=" + archivo + '}';
    }
    
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for(Usuarios U: ListaUsuarios) {
                bw.write(U.getNombre() + ";");
                bw.write(U.getUsuario()+";");
                bw.write(U.getContraseña() + ";");
                bw.write(U.getEdad() + ";");
                bw.write(U.getTipo()+";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }
    
    public void cargarArchivo() {
        Scanner sc = null;
        ListaUsuarios = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    ListaUsuarios.add(new Usuarios(sc.next(),sc.next(),sc.next(),sc.next(),sc.nextInt()));
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
}
