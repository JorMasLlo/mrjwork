/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica086;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author jordi
 */
public class Practica086 {
    static ArrayList<Contador> lista = new ArrayList<Contador>(); //Creacion del arraylist de objetos
    static Scanner teclado=new Scanner (System.in); //Entrada teclado
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        leerArray();
        modificar();
    }
    public static void leerArray(){
      
       int numero;
       
       Contador contar;
       int N;
       
       do{
           System.out.println("Numero de contadores?");
           N=teclado.nextInt();
       }
       while (N<0);
       
       for(int contador=0; contador<N; contador++){
           System.out.println("Creado contador "+contador);
           
            numero=0;
            
            contar=new Contador();
            
            contar.setNumero(numero);
            
            lista.add(contar);
       }
    }
    
    public static void modificar(){
        Contador contar=new Contador();
        int opcion, eleccion;
        boolean loop=true;
        
        while (loop){
            System.out.println("1-Incrementar|2-Decrementar|3-Saltar|0-Salir y mostrar contadores");
            opcion=teclado.nextInt();
            if (opcion==0){
                break;
            }
            System.out.println("Cual de los "+lista.size()+" contadores");
            eleccion=teclado.nextInt();
            
            contar.setOpcion(opcion);  
           
            lista.get(eleccion).setNumero(contar.mover(opcion, lista.get(eleccion).getNumero()));
        }
        
        for(int contador=0; contador<lista.size(); contador++){
            System.out.println(lista.get(contador));
        }
        
    }
    
}
