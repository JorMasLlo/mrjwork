/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaext1;

/**
 *
 * @author jordi
 */
public class Calculo {
    
    public double calcular(double hipotenusa, double b, double c){
        double resultado=0;
        if(hipotenusa==0 && b>0 && c>0){
            resultado=Math.sqrt(Math.pow(b,2)+Math.pow(c,2));
        }
        else if (hipotenusa>0 && b==0 && c>0){
            resultado=Math.sqrt(Math.pow(hipotenusa,2)-Math.pow(c,2));
        }
        else if (hipotenusa>0 && b>0 && c==0){
            resultado=Math.sqrt(Math.pow(hipotenusa,2)-Math.pow(b,2));
        }
        else{
            System.out.println("Los valores introducidos son incorrectos");
        }
        return resultado; 
    }
}
