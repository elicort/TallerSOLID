/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postres;

import Adicionales.Aderezo;
import java.util.ArrayList;

/**
 *
 * @author Deja mi lapto ¬¬...!
 */
public class Postre {
    protected String sabor;
    protected double precioParcial;
    protected ArrayList<Aderezo> aderezos;
    
    public double getPrecioParcial() {
        return precioParcial;
    }
    
    
    
    public ArrayList<Aderezo> getAderezos() {
        return aderezos;
    }

    @Override
    public String toString() {
        return "Postre{" + "sabor=" + sabor + ", precioParcial=" + precioParcial + ", aderezos=" + aderezos + '}';
    }
    
}