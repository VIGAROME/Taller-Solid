/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import Adicionales.Aderezo;
import Postres.*;
import Procesos.*;
import Leche.*;
/**
 *
 * @author djurado
 */
public class Sistema {
    public static void main(String [ ] args){
        // Producir un helado de vainilla y una torta de chocolate, 
        // a ambos agregarles CREMA y FRUTILLAS
        // y cambiar el tipo de leche por Leche Deslactosada
        ArrayList<Postre> arrPostres = new ArrayList<>();
        ManejadorDeLeche mnj_leche = new ManejadorDeLeche(new LecheDescremada());
        
        // Producir Helado

        Helado helado_vainilla = new Helado("Vainilla");
        helado_vainilla.añadirAderezo(Aderezo.CREMA);
        helado_vainilla.añadirAderezo(Aderezo.FRUTILLA);
        System.out.println(helado_vainilla);
//        mnj_leche.cambiarTipoLeche(leche, helado_vainilla);
        System.out.println(helado_vainilla.showPrecioFinal());
        
        // Producir Pastel
        Pastel pastel_chocolate = new Pastel("Chocolate");
        pastel_chocolate.quitarAderezo(Aderezo.CREMA);
        pastel_chocolate.quitarAderezo(Aderezo.FRUTILLA);
        System.out.println(pastel_chocolate);
//        mnj_leche.cambiarTipoLeche(leche, pastel_chocolate);
        System.out.println(helado_vainilla.showPrecioFinal());

        
        arrPostres.forEach(postre -> {
            postre.addAderezos(new Crema());
            postre.addAderezos(new Frutilla());
            System.out.println(postre);
            mnj_leche.cambiarTipoLeche(postre);
            System.out.println(ManejadorDePrecio.showPrecioFinal(postre));
        });        
        
    }

}
