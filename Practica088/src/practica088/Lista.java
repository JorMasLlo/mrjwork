/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica088;

import java.util.ArrayList;

/**
 *
 * @author jordi
 */
public class Lista {
    private ArrayList<Libro> prestamo=new ArrayList<Libro>();
    
    public Lista(){
    }
    
    public Lista(String isbn, String titulo, String autor, int ejemplares, int prestados){
        Libro auxLibro=new Libro(isbn, titulo, autor, ejemplares, prestados);
        prestamo.add(auxLibro);
    }
    
    public void getLibroList(int opcion){
    for(int contador=0; contador<prestamo.size(); contador++){
            System.out.println("---LIBRO "+(contador+1)+"---");
            System.out.println("ISBN "+prestamo.get(contador).getIsbn());
            System.out.println("TITULO "+prestamo.get(contador).getTitulo());
            System.out.println("AUTOR "+prestamo.get(contador).getAutor());
            System.out.println("EJEMPLARES "+prestamo.get(contador).getEjemplares());
            System.out.println("PRESTADOS "+prestamo.get(contador).getPrestados());  
        }
    }
    
    public void setLibroList(Libro auxLibro){
        prestamo.add(auxLibro);
    }
    
    public  void devolucion(int opcion){
        if (prestamo.get(opcion).getEjemplares()>=0 && prestamo.get(opcion).getPrestados()>0) {
        int prestado=prestamo.get(opcion).getPrestados();
        int ejemplo=prestamo.get(opcion).getEjemplares();
        prestado--;
        ejemplo++;
        prestamo.get(opcion).setEjemplares(ejemplo);
        prestamo.get(opcion).setPrestados(prestado);
       } 
        else{
         System.out.println("No hay mas libros que devolver");
        }
    }
    
    public void prestamo(int opcion){
       if (prestamo.get(opcion).getEjemplares()>0 && prestamo.get(opcion).getPrestados()>=0) {
        int prestado=prestamo.get(opcion).getPrestados();
        int ejemplo=prestamo.get(opcion).getEjemplares();
        prestado++;
        ejemplo--;
        prestamo.get(opcion).setEjemplares(ejemplo);
        prestamo.get(opcion).setPrestados(prestado);
       } 
        else{
         System.out.println("No hay mas ejemplares para prestar");
        }
    }
 }
    
