/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica081;

/**
 *
 * @author jordi
 */
public class Practica081 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Llamamos a las clases esferico e introduccion
        Esferico esfera=new Esferico();
        Introduccion valor=new Introduccion();
        
        System.out.println("La esfera con un radio de "+valor.leerRadio()+ //Introducimos el radio
        " tiene un area de "+esfera.area(valor.radio())+" y un volumen de "
        +esfera.volumen(valor.radio())); /*Resultado*/
    }
    
}
