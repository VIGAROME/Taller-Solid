/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Procesos;

import Postres.Helado;

/**
 *
 * @author irvin
 */
public class ManejadorDePrecio {
    public double calcularPrecioFinal(Postre p){
        double precioFinal;
        precioFinal=(get.precioParcial*1.12)+(aderezos.size()*0.50);
        return precioFinal;
    }
    public String showPrecioFinal(){
        return "Precio Final: $ " + calcularPrecioFinal();
    }
    
}

