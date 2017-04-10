/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica083;

import java.util.Scanner;

/**
 *
 * @author jordi
 */
public class Introduccion {
    private double a, b, c;
    Scanner teclado=new Scanner (System.in); /*Entrada teclado*/
    
    public Introduccion(){ //Introducimos el valor de dinero
        
        System.out.println("Que valor tienen A, B y C?"); /*Mensaje de introduccion*/
        a=teclado.nextDouble(); /*Indicando valor*/
        b=teclado.nextDouble(); /*Indicando valor*/
        c=teclado.nextDouble(); /*Indicando valor*/
    }
    public double A(){
        return a;
    }
    public double B(){
        return b;
    }
    public double C(){
        return c;
    }
}
