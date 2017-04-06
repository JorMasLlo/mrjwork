/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica079;

import java.util.Scanner;

/**
 *
 * @author jordi
 */
public class Introduccion {
    private double lado, apotema;
    Scanner teclado=new Scanner (System.in); /*Entrada teclado*/   
    
    public double leerLado(){ //Introducimos la medida de uno de los lados
        
        System.out.println("Cuanto mide el lado del pentagono?"); /*Mensaje de introduccion*/
        lado=teclado.nextDouble(); /*Indicando valor*/
        return lado;
    }
    public double lado(){//Lo almacenamos para poder usarlo en main
        return lado;
    }
    public double leerApotema(){ //Introducimos la medida del apotema
        
        System.out.println("Cuanto mide el apotema del pentagono?"); /*Mensaje de introduccion*/
        apotema=teclado.nextDouble(); /*Indicando valor*/
        return apotema;
    }
    public double apotema(){//Lo almacenamos para poder usarlo en main
        return apotema;
    }
}
