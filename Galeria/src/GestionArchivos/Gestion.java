/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionArchivos;

import Logica.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;

/**
 *
 * @author Estudiante
 */
public class Gestion {
    private String ruta;

    public Gestion(String ruta) {
        this.ruta = ruta;
    }
       
    public boolean guardar(ArrayList<Artista> artistas,ArrayList<Comprador> compradores, ArrayList<Obra> obras) throws IOException{
        File archivo = new File(this.ruta);
        if(!archivo.exists())
            archivo.createNewFile();
        PrintStream salida = new PrintStream(archivo);
        for(int i=0;i<compradores.size();i++){
            salida.println("Comprador");
            salida.println(compradores.get(i));
            salida.print(" ");
        }
        for(int i=0;i<artistas.size();i++){
            salida.print("Artista");
            salida.println(artistas.get(i));
            salida.print(" ");
            int numObras=artistas.get(i).getObras().size();
            salida.println("Numero de Obras: "+numObras);
            salida.println("Obras: ");
            for(int j=0;j<numObras;j++){
                salida.println(artistas.get(i).getObras().get(j));
            }
        }
        salida.print("\n");
        salida.flush();
        salida.close();
        return true;
    }
}
