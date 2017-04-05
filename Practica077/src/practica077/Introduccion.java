/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica077;

import java.util.Scanner;

/**
 *
 * @author jordi
 */
public class Introduccion {
        private double radio;
        
    
    public double leer(){ //Introducimos el radio
        Scanner teclado=new Scanner (System.in); /*Entrada teclado*/
        System.out.println("Que radio tiene la circunferencia?"); /*Mensaje de introduccion*/
        radio=teclado.nextDouble(); /*Indicando valor*/
        return radio;
    }
    public double dato(){//Lo almacenamos para poder usarlo en main
        return radio;
    }
}
