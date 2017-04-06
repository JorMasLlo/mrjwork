/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica078;

/**
 *
 * @author jordi
 */
public class Practica078 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Triangular triangulo=new Triangular();
        Introduccion valor=new Introduccion();
        
        System.out.println("El triangulo con una base de "+valor.leerBase()+ //Introducimos base e hipotenusa
        " e hipotenusa de "+ valor.leerHipotenusa() +"tiene un area de "
        +triangulo.area(valor.base(),valor.hipotenusa())
       ); /*Resultado*/
    }
    
}
