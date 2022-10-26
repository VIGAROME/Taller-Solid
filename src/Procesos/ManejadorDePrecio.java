/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Procesos;

import Postres.Helado;
import Postres.Postre;

/**
 *
 * @author irvin
 */
public class ManejadorDePrecio {
    public static double calcularPrecioFinal(Postre p){
        double precioFinal;
        precioFinal=(p.getPrecioParcial()*1.12)+(p.getAderezos().size()*0.50);
        return precioFinal;
    }
    public static String showPrecioFinal(Postre p){
        return "Precio Final: $ " + calcularPrecioFinal(p);
    }
    
}

