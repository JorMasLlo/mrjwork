/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica076;

import java.util.Scanner;

/**
 *
 * @author jordi
 */
public class Calculadora {
    
    Scanner teclado=new Scanner (System.in); /*Entrada teclado*/
        private float num1, num2;
         
        
        public float suma(float num1, float num2){
            return num1+num2;
        }
        public float resta(float num1, float num2){
            return num1-num2;
        }
        public float multiplicacion(float num1, float num2){
            return num1*num2;
        }
        public float division(float num1, float num2){
            return num1/num2;
        }
        public float modulo(float num1, float num2){
            return num1%num2;
        }
    
}
