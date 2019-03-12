/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Lenovo
 */
public abstract class Compra {
    private double dinero;

    public Compra(double dinero) {
        this.dinero = dinero;
    }
    
    public abstract void efectuarCompra();
}
