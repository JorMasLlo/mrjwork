/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica082;

/**
 *
 * @author jordi
 */
public class Calculo {
    
    public int [] magnitud(){
        //declaramos un array con todas las monedas
        int [] monedas={500, 200, 100, 50, 20, 10, 5, 2, 1};
        return monedas;
    }
    
    public int [] calcular(int dinero, int [] monedas){

        int [] devolver =new int [monedas.length];//Indicamos que tenga el mismo tamaño que el array monedas
        
        for(int contador=0; contador<monedas.length; contador++){
            if(dinero>=monedas[contador]){
                devolver[contador]=(int)Math.floor(dinero/monedas[contador]);//Obtenemos la cantidad de monedas
                dinero=dinero-(devolver[contador]*monedas[contador]);
            }
        }
        return devolver;
    }
}
