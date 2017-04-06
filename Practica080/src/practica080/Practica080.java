/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica080;

/**
 *
 * @author jordi
 */
public class Practica080 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cubiculo cubo=new Cubiculo();
        Introduccion valor=new Introduccion();
        
        System.out.println("El cubo con una arista de "+valor.leerArista()+ //Introducimos la arista
        " tiene un area de "+cubo.area(valor.dato())); /*Resultado*/
    }
    
}
