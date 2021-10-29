/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;

import Adicionales.Aderezo;
import Postres.Postre;

/**
 *
 * @author Deja mi lapto ¬¬...!
 */
public class OperacionesAderezo {
    
    
    public static void anadirAderezo(Postre p, Aderezo aderezo){
        p.getAderezos().add(aderezo);
    }
    
    public static void quitarAderezo(Postre p, Aderezo aderezo){
        p.getAderezos().remove(aderezo);
    }
}
