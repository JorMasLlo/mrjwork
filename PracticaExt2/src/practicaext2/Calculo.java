/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaext2;

/**
 *
 * @author jordi
 */
public class Calculo {
   public int [] magnitud(){
        //declaramos un array las semanas, dias horas y minutos en segundos
        int [] cantidad={604800,86400,3600,60,1};
        return cantidad;
    }
    public int [] calcular(int segundos, int [] cantidad){

        int [] devolver =new int [cantidad.length];//Indicamos que tenga el mismo tamaño que el array cantidad
        
        for(int contador=0; contador<cantidad.length; contador++){
            if(segundos>=cantidad[contador]){
                devolver[contador]=(int)Math.floor(segundos/cantidad[contador]);//Obtenemos la cantidad de cantidad
                segundos=segundos-(devolver[contador]*cantidad[contador]);
            }
        }
        return devolver;
    }
}
