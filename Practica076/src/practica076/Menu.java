/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica076;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jordi
 */
public class Menu {

    Scanner teclado=new Scanner (System.in); /*Entrada teclado de caracteres*/
        private float num1, num2;
        private char simbolo;
        
    public float dato1(){
        System.out.println("Introduzca el primer numero"); /*Mensaje de introduccion*/
        num1=teclado.nextFloat(); /*Indicando valor*/
        return num1;
    }
    public char eleccion(){
        System.out.println("Que desea hacer? Suma(+), Resta(-), Multiplicacion(*), Division(/), Modulo(%), Apagar (X)"); /*Mensaje de introduccion*/
        try {
            //simbolo=(char)teclado.findInLine(".").charAt(0); /*Indicando caracter*/
            simbolo=(char)System.in.read();
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        return simbolo;
    }
    public float dato2(){
        System.out.println("Introduzca el segundor numero"); /*Mensaje de introduccion*/
        num2=teclado.nextFloat(); /*Indicando valor*/
        return num2;
    }
    
}
