/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaext1;

/**
 *
 * @author jordi
 */
public class PracticaExt1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Llamamos a las clases calculo e introduccion
        Calculo resultado=new Calculo();
        Introduccion valor=new Introduccion();
        
        System.out.println("La longitud del valor desconocido es de "
        +resultado.calcular(valor.Hipo(),valor.B(), valor.C())); /*Resultado*/
        
    }
    
}
