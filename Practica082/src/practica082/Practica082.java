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
public class Practica082 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //Llamamos a las clases esferico e introduccion
        Calculo vueltas=new Calculo();
        Introduccion valor=new Introduccion();
        valor.leerImporte();//Declaramos el valor de dinero
        
        for(int contador=0; contador<vueltas.magnitud().length;contador++){
            if (vueltas.calcular(valor.importe(),vueltas.magnitud())[contador]>0){
                if(vueltas.magnitud()[contador]>2){//Si es superior a las monedas de 2€ es un billete
                    System.out.println("Hay "+vueltas.calcular(valor.importe(), vueltas.magnitud())[contador]+
                    " billetes de "+vueltas.magnitud()[contador]);
                }
                else{//Si es inferior seran monedas
                    System.out.println("Hay "+vueltas.calcular(valor.importe(), vueltas.magnitud())[contador]+
                    " monedas de "+vueltas.magnitud()[contador]);
                }
            }
        }
    }
    
}
