/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaext1;

import java.util.Scanner;

/**
 *
 * @author jordi
 */
public class Introduccion {
    private double b, c;
    Scanner teclado=new Scanner (System.in); /*Entrada teclado*/
    
    public Introduccion(){ //Introducimos el valor de dinero
        
        System.out.println("Que longitud tienen los catetos B y C?"); /*Mensaje de introduccion*/
        b=teclado.nextDouble(); /*Indicando valor*/
        c=teclado.nextDouble(); /*Indicando valor*/
    }
    public double B(){
        return b;
    }
    public double C(){
        return c;
    }
}
