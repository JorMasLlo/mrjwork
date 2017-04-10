/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica083;

/**
 *
 * @author jordi
 */
public class Practica083 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Llamamos a las clases esferico e introduccion
        Equacion calculo=new Equacion();
        Introduccion valor=new Introduccion();
        
        System.out.println("Los resultados de la equacion de segundo grado son "
        +calculo.resultado(valor.A(), valor.B(), valor.C())+
        " y "+calculo.resultado2(valor.A(), valor.B(), valor.C())); /*Resultado*/
    }
    
}
