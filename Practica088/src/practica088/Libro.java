/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica088;

/**
 *
 * @author jordi
 */
public class Libro {
    private String isbn, titulo, autor;
    private int ejemplares, prestados;
    
    
    public Libro(){}//constructor por defecto
    
    public Libro(String isbn, String titulo, String autor, int ejemplares, int prestados){//constructor con parametros
        this.isbn=isbn;
        this.titulo=titulo;
        this.autor=autor;
        this.ejemplares=ejemplares;
        this.prestados=prestados;
    }
    
     public Libro (Libro leido){//Constructor copia
        this.isbn=leido.isbn;
        this.titulo=leido.titulo;
        this.autor=leido.autor;
        this.ejemplares=leido.ejemplares;
        this.prestados=leido.prestados;
    }
    
    
    //Setters y Getters
    public String getIsbn(){
        return isbn;
    }
    public  void setIsbn(String isbn){
        this.isbn=isbn;
    }
    
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
    
    
    
    
}
