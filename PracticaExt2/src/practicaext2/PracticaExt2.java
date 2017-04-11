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
public class PracticaExt2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //Llamamos a las clases esferico e introduccion
        Calculo vueltas=new Calculo();
        Introduccion valor=new Introduccion();
        valor.leerTiempo();//Declaramos el valor de dinero
        String [] nombres={"semanas","dias","horas", "minutos", "segundos"};
        
        System.out.println(valor.tiempo()+" segundos son: ");
        
        for(int contador=0; contador<vueltas.magnitud().length;contador++){
            if (vueltas.calcular(valor.tiempo(),vueltas.magnitud())[contador]>0){
                System.out.println(+vueltas.calcular(valor.tiempo(), vueltas.magnitud())[contador]+
                " "+nombres[contador]);
            }
        }
    }
    
}
