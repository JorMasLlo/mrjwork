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
public class Practica076 {

     public static void main(String[] args) {

         Calculadora calc=new Calculadora();

         Menu m=new Menu();
   
         boolean estado=false;

      while (!estado){

        switch (m.eleccion()){
            case'+': 
                System.out.println("El resultado de la suma es "+ calc.suma(m.dato1(), m.dato2()));
                break;
            case'-':
                System.out.println("El resultado de la resta es "+ calc.resta(m.dato1(), m.dato2()));
                break;
            case '*':
                System.out.println("El resultado de la multiplicacion es "+ calc.multiplicacion(m.dato1(), m.dato2()));
                break;
            case '/':
                System.out.println("El resultado de la division es "+ calc.division(m.dato1(), m.dato2()));
                break;
            case '%':
                System.out.println("El resto de la division es "+ calc.modulo(m.dato1(), m.dato2()));
                break;
            case 'x':
            case 'X':
                estado=true;
                break;
            default:System.out.println("Error en el estado"); /*Resultado no encontrado*/
            break;
                
        }
      }
    }
         
           
    
    
    
        
 }
