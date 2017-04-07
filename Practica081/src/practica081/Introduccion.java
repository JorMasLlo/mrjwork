/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica081;

import java.util.Scanner;

/**
 *
 * @author jordi
 */
public class Introduccion {
     private double radio;
    Scanner teclado=new Scanner (System.in); /*Entrada teclado*/   
    
    public double leerRadio(){ //Introducimos la medida de uno de los lados
        
        System.out.println("Cuanto mide el radio de la esfera?"); /*Mensaje de introduccion*/
        radio=teclado.nextDouble(); /*Indicando valor*/
        return radio;
    }
    public double radio(){//Lo almacenamos para poder usarlo en main
        return radio;
    }
}
