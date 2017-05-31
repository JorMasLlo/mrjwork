/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica090;

import java.lang.reflect.Method;
import java.util.Scanner;

/**
 *
 * @author jordi
 */
public class Practica090 {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int DNI;
        
        Scanner teclado=new Scanner (System.in);
        NIF n=new NIF();
        
        System.out.println("-Cual es tu DNI? ");
        DNI=teclado.nextInt();
        
        if(DNI<100000000 && DNI>9999999){
            n.setDNI(DNI);
           // n.setLetra('x');//le asigno una letra provisional para poder llamar al setter Letra
            System.out.println("Tu DNI completo es "+DNI+""+n.getLetra());
        }
        else{
        System.out.println("El DNI no es valido. Debe tener 8 numeros");
        }
        
    }
    
}
