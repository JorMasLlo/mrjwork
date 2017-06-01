/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica089;

import java.util.Scanner;

/**
 *
 * @author jordi
 */
public class Practica089 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado=new Scanner (System.in);
        
        
        String dia, mes, año;
        
        System.out.println("Dia?");
        dia=teclado.next();
        System.out.println("Mes?");
        mes=teclado.next();
        System.out.println("Año?");
        año=teclado.next();
        FechaReal date = new FechaReal(dia, mes, año);
        date.setDia(dia);
        date.setMes(mes);
        date.setAño(año);
    }
    
}
