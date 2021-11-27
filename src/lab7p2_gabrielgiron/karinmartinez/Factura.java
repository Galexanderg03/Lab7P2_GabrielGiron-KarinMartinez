
package lab7p2_gabrielgiron.karinmartinez;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Factura {
    public Basededatos f =new Basededatos();
    ArrayList <Accesorio> comprado =new ArrayList();
    private File archivo = null;
    public Factura(String path) 
    {
        archivo = new File(path);
    }

    public ArrayList<Accesorio> getComprado() {
        return comprado;
    }

    public void setComprado(ArrayList<Accesorio> comprado) {
        this.comprado = comprado;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "Factura{" + "comprado=" + comprado + ", archivo=" + archivo + '}';
    }
    
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        long total =0;
        double isv;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            bw.write("Accesorios Nintendo\nFactura#"+f.getFactura()+"\nAccesorio\tCantidad\tPrecio(unidad)\n");
            for (Accesorio t : comprado) {
                bw.write(t.getNombre()+"\t"+t.getCantidad()+"\t"+t.getPrecio());
                total=total + t.getPrecio();
                
            }
            isv =total*0.15;
            bw.write("\n\ttotal:"+total);
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }
    
    public void cargarArchivo() {
        Scanner sc = null;
        comprado = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    comprado.add(new Accesorio(sc.next(),sc.nextInt(),sc.nextInt()));
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
}
