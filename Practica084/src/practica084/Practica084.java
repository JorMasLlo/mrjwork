/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica084;

import java.util.Scanner;

/**
 *
 * @author jordi
 */
public class Practica084 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nombre, apellido1, apellido2, dni,tipo_interes, nombre_completo;
        double numero, saldo;
        boolean X = true;
        int opcion, numero_cuenta;
        
        
        Scanner teclado=new Scanner (System.in); /*Entrada teclado*/
        Cuenta operacion=new Cuenta();
        
         //introduccion de datos
            System.out.print("-Nombre: ");
            nombre=teclado.nextLine();
            System.out.print("-Apellido: ");
            apellido1=teclado.nextLine();
            System.out.print("-Apellido2: ");
            apellido2=teclado.nextLine();
            System.out.print("-DNI: ");
            dni=teclado.nextLine();
            System.out.print("-Tipo de interes: Simple, Compuesto, Nominal, Efectivo, Fijo, Variable o Implicito? ");
            tipo_interes=teclado.nextLine();
            System.out.print("-Numero de cuenta: ");
            numero_cuenta=teclado.nextInt();
            System.out.print("-Saldo en la cuenta: ");
            saldo=teclado.nextDouble();
        Cuenta operacion2=new Cuenta(nombre,apellido1,apellido2,dni,tipo_interes,numero_cuenta,saldo);
        while(X=true){
            
            System.out.println("Opcion: 1-Ingresar 2-Reintegro 3-Transferencia 4-Salir");
            opcion=teclado.nextInt(); /*Indicando valor*/
            
            if(opcion!=4){
                System.out.println("Que cantidad?"); /*Mensaje de introduccion*/
                numero=teclado.nextDouble(); /*Indicando valor*/
                 
                operacion.setCantidad(numero);
                operacion.setNombre(nombre);
                operacion.setApellido1(apellido1);
                operacion.setApellido2(apellido2);
                operacion.setDni(dni);
                operacion.setTipo_interes(tipo_interes);
                operacion.setNumero_cuenta(numero_cuenta);
                operacion.setSaldo(saldo);
                
                nombre_completo=operacion.getNombre()+" "+operacion.getApellido1()+" "+operacion.getApellido2();

                System.out.println("-Cliente: "+nombre_completo+" con DNI "+operacion.getDni()+" y tipo de interes "+operacion.getTipo_interes()+" tiene un saldo de: "+operacion.getSaldo(opcion));
            }
            else{
            System.out.println("Adios");
            break;
            }
            
        }   
            
        
    }
    
}
