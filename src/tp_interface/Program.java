/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_interface;

import tp_interface.Vehicule.*;

/**
 *
 * @author Formation
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Avion unAvion = new Avion();
        
        
    }
    public static void faireVoler(IV_Volent unVehicule_Volent)
    {
        System.out.println("Il vole !!");
    }
    public static void faireVoler(Vehicule unVehicule_Volent)
    {
        System.out.println("Il ne vole pas!!");
    }
    public static void faireRouler(IV_Roulent unVehicule_Roulent)
    {
        System.out.println("Il Roule !!");
    }
    
}
