/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaext2;

import java.util.Scanner;

/**
 *
 * @author jordi
 */
public class Introduccion {
     private int segundos;
    Scanner teclado=new Scanner (System.in); /*Entrada teclado*/
    
    public int leerTiempo(){ //Introducimos el numero de segundos
        
        System.out.println("Ingresar numero de segundos a desglosar"); /*Mensaje de introduccion*/
        segundos=teclado.nextInt(); /*Indicando valor*/
        return segundos;
    }
    public int tiempo(){
        return segundos;
    }
}
