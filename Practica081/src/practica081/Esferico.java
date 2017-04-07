/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica081;

/**
 *
 * @author jordi
 */
public class Esferico {
    
    public double area(double radio){
        return 4*Math.PI*Math.pow(radio,2);
    }
    public double volumen (double radio){
        return ((4.0/3.0)*Math.PI*Math.pow(radio,3));
    }
}
