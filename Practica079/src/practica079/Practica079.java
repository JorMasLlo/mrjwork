/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica079;

/**
 *
 * @author jordi
 */
public class Practica079 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pentagonal pentagono=new Pentagonal();
        Introduccion valor=new Introduccion();
        
        System.out.println("El pentagono con un lado de "+valor.leerLado()+ //Introducimos lado y apotema
        " y apotema de "+ valor.leerApotema() +" tiene un area de "
        +pentagono.area(valor.lado(),valor.apotema())
       ); /*Resultado*/
    }
    
}
