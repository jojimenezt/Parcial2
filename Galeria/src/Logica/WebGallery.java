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
public class WebGallery {
    private Cuenta cuenta;
    private ArrayList<Artista> artistas;
    private ArrayList<Comprador> compradores;
    private ArrayList<Obra> coleccion;
    private ArrayList<PSE> pagosPSE;
    private ArrayList<Tarjeta> pagosTarjeta;

    public WebGallery() {
        this.cuenta=new Cuenta(123456,0.0);
        this.artistas=new ArrayList<>();
        this.compradores=new ArrayList<>();
        this.coleccion=new ArrayList<>();
        this.pagosPSE=new ArrayList<>();
        this.pagosTarjeta=new ArrayList<>();
    
    }
    
    public void addArtista(Artista artista){
        this.artistas.add(artista);
    }
    
    public void addComprador(Comprador comprador){
        this.compradores.add(comprador);
    }
    
    public void addObra(Obra obra){
        this.coleccion.add(obra);
    }
    
    public double valorObras(){
        double valor=0.0;
        if(this.coleccion.size()==0)throw new ArrayIndexOutOfBoundsException (" no se ha agregado ninguna obra a la galeria, valor 0.0");
        else{
            for(int i=0;i<this.coleccion.size();i++){
                valor=valor +this.coleccion.get(i).getValor();
            }
        }
        
        return valor;
        
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public ArrayList<Artista> getArtistas() {
        return artistas;
    }

    public void setArtistas(ArrayList<Artista> artistas) {
        this.artistas = artistas;
    }

    public ArrayList<Comprador> getCompradores() {
        return compradores;
    }

    public void setCompradores(ArrayList<Comprador> compradores) {
        this.compradores = compradores;
    }

    public ArrayList<Obra> getColeccion() {
        return coleccion;
    }

    public void setColeccion(ArrayList<Obra> coleccion) {
        this.coleccion = coleccion;
    }

    public ArrayList<PSE> getPagosPSE() {
        return pagosPSE;
    }

    public void setPagosPSE(ArrayList<PSE> pagosPSE) {
        this.pagosPSE = pagosPSE;
    }

    public ArrayList<Tarjeta> getPagosTarjeta() {
        return pagosTarjeta;
    }

    public void setPagosTarjeta(ArrayList<Tarjeta> pagosTarjeta) {
        this.pagosTarjeta = pagosTarjeta;
    }

}
