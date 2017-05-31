/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica088;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jordi
 */
public class Practica088 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int N;
        String isbn, titulo, autor;
        int ejemplares, prestados, eleccion, opcion;
        
        Lista leer=new Lista ();
        
        
        Scanner teclado=new Scanner (System.in);
        
        
        do{
           System.out.println("Numero de libros?");
           N=teclado.nextInt();
            }
       while (N<0);
       
       for(int contador=0; contador<N; contador++){
           System.out.println("Libro "+contador);

           System.out.println("--DATOS DEL LIBRO--");
           System.out.print("-ISBN: ");
           isbn=teclado.next();
           System.out.print("-Titulo: ");
           titulo=teclado.next();
           System.out.print("-Autor: ");
           autor=teclado.next();
           System.out.print("-Ejemplares: ");
           ejemplares=teclado.nextInt();
           System.out.print("-Prestados: ");
           prestados=teclado.nextInt();
           
           
           Libro book=new Libro(isbn, titulo, autor, ejemplares, prestados);
           book.setIsbn(isbn);
           book.setTitulo(titulo);
           book.setAutor(autor);
           book.setEjemplares(ejemplares);
           book.setPrestados(prestados);
           leer.setLibroList(book);
           
       }

         boolean inicio=true;
         
         
       while (inicio){
         System.out.println("1-Devolver 2-Tomar prestado 3-Ver libro 4-Salir");
         eleccion=teclado.nextInt();
           System.out.println("Cual de los libros?");
           opcion=teclado.nextInt();
         
           switch (eleccion){
             
             case 1: 
                 leer.devolucion(opcion);
                 break;
                 
             case 2:
                leer.prestamo(opcion);
                 break;
                 
             case 3:
                 leer.getLibroList(opcion);
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
