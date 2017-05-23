/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica087;

import java.util.Scanner;

/**
 *
 * @author jordi
 */
public class Practica087 {
    static Scanner teclado=new Scanner (System.in); /*Entrada teclado*/
    static Libro book=new Libro();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        leerLibro();
        System.out.println("Desea llevarse o devolver algun libro? 1-Si 0-No");
        opcion=teclado.nextInt();
        if(opcion==1){
            prestamos();
        }
    }
    
     public static void leerLibro(){
            book.setTitulo("La isla del tesoro");
            book.setAutor("Robert Louis Stevenson");
            book.setEjemplares(3);
            book.setPrestados(0);
       }
     
     public static void prestamos(){
         int eleccion;
         boolean inicio=true;
         
       while (inicio){
         System.out.println("1-Devolver 2-Tomar prestado 3-Ver libro 4-Salir");
         eleccion=teclado.nextInt();
         
           switch (eleccion){
             
             case 1: 
                 book.devolucion();
                 break;
                 
             case 2:
                 book.prestamo();
                 break;
                 
             case 3:
                 System.out.println(book.muestraLibro());
                 break;
             case 4:
                 inicio=false;
                 break;
                 
             default:
                 System.out.println("Opcion incorrecta");
                 break;
             
         }
       }
         
         
         
     }
     
    }
    

