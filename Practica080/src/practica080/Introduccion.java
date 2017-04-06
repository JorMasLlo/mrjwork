/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica080;

import java.util.Scanner;

/**
 *
 * @author jordi
 */
public class Introduccion {
     private double arista;
    Scanner teclado=new Scanner (System.in); /*Entrada teclado*/   
    
    public double leerArista(){ //Introducimos la medida de uno de los lados
        
        System.out.println("Cuanto mide la arista del cubo?"); /*Mensaje de introduccion*/
        arista=teclado.nextDouble(); /*Indicando valor*/
        return arista;
    }
    public double dato(){//Lo almacenamos para poder usarlo en main
        return arista;
    }
}
