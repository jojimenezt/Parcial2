/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class Comprador extends Persona {
    private ArrayList<Obra> compradas;
    public Comprador(String nombre, String apellido) {
        super(nombre, apellido);
        this.compradas=new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public void comprar(Obra obra){
        this.compradas.add(obra);
    }
}
