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
public class Helado extends Postre{
        
    public Helado(String sabor) {
        super(sabor, 7.85, new ArrayList<>());
    }
       
    @Override
    public String toString() {
        return "Helado{" + "sabor=" + getSabor() + ", precioParcial=" + getPrecioParcial() + ", aderezos=" + getAderezos() + '}';
    }
}