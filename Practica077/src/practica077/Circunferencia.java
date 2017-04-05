/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica077;

/**
 *
 * @author jordi
 */
public class Circunferencia {
    private double radio;
    
    public double area(double radio){
            return Math.PI*Math.pow(radio, 2);//Calculo del area
        }
    public double longitud(double radio){//Claculo de la longitud
            return Math.PI*(radio*2);
        }
}
