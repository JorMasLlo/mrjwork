/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica077;

/**
 *
 * @author jordi
 */
public class Practica077 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Llamar a las clases
        Circunferencia circulo=new Circunferencia();
        Introduccion valor=new Introduccion();
        
        System.out.println("La circunferencia con un radio de "+valor.leer()+ //Introducimos el radio
        " tiene un area de "+circulo.area(valor.dato())+" y una longitud de "
        +circulo.longitud(valor.dato())); /*Resultado*/
    }
    
}
