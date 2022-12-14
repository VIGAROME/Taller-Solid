/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Postres;


import java.util.ArrayList;
import Adicionales.*;

/**
 *
 * @author garci
 */
public class Postre {
    private String sabor;
    private double precioParcial;
    private final ArrayList<Aderezo> aderezos;

    public Postre(String sabor, double precioParcial, ArrayList<Aderezo> aderezos) {
        this.sabor = sabor;
        this.precioParcial = precioParcial;
        this.aderezos = aderezos;
    }
    
    public ArrayList<Aderezo> getAderezos() {
        return aderezos;
    }
    
    public double calcularPrecioFinal(){
        double precioFinal;
        precioFinal=(precioParcial+(precioParcial*0.12))+(aderezos.size()*0.50);
        return precioFinal;
    }

    public String getSabor() {
        return sabor;
    }
    public double getPrecioParcial() {
        return precioParcial;
    }
    
    //Método para eliminar aderezo
    public void quitarAderezo(Aderezo aderezo){
       this.getAderezos().remove(aderezo);
    }
    
    //Método para añadir aderezo
    public void addAderezos(Aderezo aderezo){
       this.aderezos.add(aderezo);
    }
    
    
}
