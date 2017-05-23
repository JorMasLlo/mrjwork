/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica086;

import static practica086.Practica086.teclado;

/**
 *
 * @author jordi
 */
public class Contador {
    
    private int opcion, numero, eleccion;
    
    public Contador(){}//Constructor por defecto
    
    public Contador (int numero){//Constructor con aprametros
        this.numero=numero;
    }
    
    public Contador (Contador contado){//Constructor copia
        this.numero=contado.numero;
    }
    
    //Getters y Setters    
    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){
        this.numero=numero;
    }
    
    public int getOpcion(){
        return opcion;
    }
    public void setOpcion(int opcion){
        this.opcion=opcion;
    }
    
    public int getEleccion(){
        return eleccion;
    }
    public void setEleccion(int eleccion){
        this.eleccion=eleccion;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nNumero=");
        sb.append(numero);
        
        return sb.toString();
        
    }
    
    //Metodo
    public int mover (int opcion, int numero){
        int salto=0;
        switch (opcion){
            case 1:
                numero++;
                break;
            case 2:
                numero--;
                break;
            case 3:
                System.out.println("Cuanto desea incrementar o decrementar?");
                salto=teclado.nextInt();
                numero=numero+salto;
                break;
            default:
                System.out.println("Opcion incorrecta");
                break;
        }
        return numero;
    }
}
