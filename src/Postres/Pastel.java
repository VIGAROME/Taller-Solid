/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postres;

import java.util.ArrayList;

/**
 *
 * @author Pedro Mendoza
 */
public class Pastel extends Postre{
    
    
    public Pastel(String sabor){
        super(sabor, 15.55,new ArrayList<>());
    }
    
    
    
    @Override
    public String toString() {
        return "Pastel{" + "sabor=" + getSabor() + ", precioParcial=" + getPrecioParcial() + ", aderezos=" + getAderezos() + '}';
    }
    public String showPrecioFinal(){
        return "Precio Final: $ " + calcularPrecioFinal();
    }
    
}
