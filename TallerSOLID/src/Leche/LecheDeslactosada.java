/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leche;

import Postres.Pastel;
import Postres.Postre;

/**
 *
 * @author Pedro Mendoza
 */
public class LecheDeslactosada extends LecheEntera {

    @Override
    public void usarLeche(Postre p) {
        if(p.getClass() == Pastel.class){
            System.out.println("No se puede usar leche Deslactosada en Pastel");
        } else{
            System.out.println("Usando leche deslactosada");
        }
         
    }
    
    
        
}
