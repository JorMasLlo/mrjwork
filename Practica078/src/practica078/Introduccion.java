/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica078;

import java.util.Scanner;

/**
 *
 * @author jordi
 */
public class Introduccion {
    private double base, hipotenusa;
    Scanner teclado=new Scanner (System.in); /*Entrada teclado*/   
    
    public double leerBase(){ //Introducimos la base
        
        System.out.println("Cuanto mide la base del triangulo?"); /*Mensaje de introduccion*/
        base=teclado.nextDouble(); /*Indicando valor*/
        return base;
    }
    public double base(){//Lo almacenamos para poder usarlo en main
        return base;
    }
    public double leerHipotenusa(){ //Introducimos la hipotenusa
        
        System.out.println("Cuanto mide la hipotenusa del triangulo?"); /*Mensaje de introduccion*/
        hipotenusa=teclado.nextDouble(); /*Indicando valor*/
        return hipotenusa;
    }
    public double hipotenusa(){//Lo almacenamos para poder usarlo en main
        return hipotenusa;
    }
}
