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
public class Equacion {
    //Hacemos dos equaciones al no poder poner el simbolo mas/menos
    public double resultado(double a, double b, double c){//Equacion positiva
        double x;
        x=(-b+Math.sqrt(Math.pow(b,2)-(4*a)*c))/(2*a);

        return x;
    }
    public double resultado2(double a, double b, double c){//Equacion negativa
        double x2;
        x2=(-b-Math.sqrt(Math.pow(b,2)-(4*a)*c))/(2*a);
        
        return x2;
    }
}
