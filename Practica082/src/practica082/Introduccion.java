/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica082;

import java.util.Scanner;

/**
 *
 * @author jordi
 */
public class Introduccion {
    private int dinero;
    Scanner teclado=new Scanner (System.in); /*Entrada teclado*/
    
    public int leerImporte(){ //Introducimos el valor de dinero
        
        System.out.println("Ingresar cantidad de dinero"); /*Mensaje de introduccion*/
        dinero=teclado.nextInt(); /*Indicando valor*/
        return dinero;
    }
    public int importe(){
        return dinero;
    }
    
    
}
