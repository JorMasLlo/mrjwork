/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica087;

import java.util.ArrayList;

/**
 *
 * @author jordi
 */
public class Libro {
    //Atributos
    private int ejemplares, prestados;
    private String titulo, autor;
    
    public Libro () {}//Constructor por defecto
    
    public Libro (String titulo, String autor, int ejemplares, int prestados){//Constructor con parametros
        this.titulo=titulo;
        this.autor=autor;
        this.ejemplares=ejemplares;
        this.prestados=prestados;
    }
    
    public Libro (Libro leido){//Constructor copia
        this.titulo=leido.titulo;
        this.autor=leido.autor;
        this.ejemplares=leido.ejemplares;
        this.prestados=leido.prestados;
    }
    
    
    //Getter y Setters
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor=autor;
    }
    public int getEjemplares(){
        return ejemplares;
    }
    public void setEjemplares(int ejemplares){
        this.ejemplares=ejemplares;
    }
    public int getPrestados(){
        return prestados;
    }
    public void setPrestados(int prestados){
        this.prestados=prestados;
    }
    
    
    public int [] devolucion(){
        if (ejemplares>=0 && prestados>0) {
        prestados--;
        ejemplares++; 
       } 
        else{
         System.out.println("No hay mas libros que devolver");
        }
       return new int [] {ejemplares, prestados};
    }
    
    public int [] prestamo(){
       if (ejemplares>0 && prestados>=0) {
        prestados++;
        ejemplares--; 
       } 
        else{
         System.out.println("No hay mas ejemplares para prestar");
        }
       return new int [] {ejemplares, prestados};
    }

    public ArrayList muestraLibro(){
        ArrayList verlibro = new ArrayList();
        verlibro.add(this.getTitulo());
        verlibro.add(this.getAutor());
        verlibro.add(this.getEjemplares());
        verlibro.add(this.getPrestados());
        
        return verlibro;
    }
    
}
