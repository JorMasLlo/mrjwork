/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica085;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jordi
 */
public class Practica085 {
    static ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>(); //Creacion del arraylist de objetos
    static Scanner teclado=new Scanner (System.in); /*Entrada teclado*/
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double sueldo2;
       leerCuenta();
       System.out.println();
       mostrarCuentas();
       System.out.println("---CUENTAS MODIFICADAS---");
       cambio();
    }
    public static void leerCuenta(){
       
       String nombre, apellido1, apellido2, dni,tipo_interes, nombre_completo;
       double numero, saldo;
       int opcion, numero_cuenta;
       
       Cuenta operacion;
       int N;
       
       do{
           System.out.println("Numero de cuentas?");
           N=teclado.nextInt();
       }
       while (N<0);
       
       for(int contador=1; contador<=N; contador++){
           System.out.println("Cuenta "+contador);
           
            numero_cuenta=contador;
            System.out.print("-Nombre: ");
            nombre=teclado.next();
            System.out.print("-Apellido: ");
            apellido1=teclado.next();
            System.out.print("-Apellido2: ");
            apellido2=teclado.next();
            System.out.print("-DNI: ");
            dni=teclado.next();
            System.out.print("-Tipo de interes: Simple, Compuesto, Nominal, Efectivo, Fijo, Variable o Implicito? ");
            tipo_interes=teclado.next();
            System.out.print("-Saldo en la cuenta: ");
            saldo=teclado.nextDouble();
            
            operacion=new Cuenta();
            
            operacion.setNumero_cuenta(numero_cuenta);
            operacion.setNombre(nombre);
            operacion.setApellido1(apellido1);
            operacion.setApellido2(apellido2);
            operacion.setDni(dni);
            operacion.setTipo_interes(tipo_interes);
            operacion.setSaldo(saldo);
            
            cuentas.add(operacion);
       }
    }
    
    public static void mostrarCuentas(){
        for(int contador=0; contador<cuentas.size(); contador++){
            System.out.println(cuentas.get(contador));
        }
    }
    
    public static void cambio(){
        boolean inicio;
        double [] result=new double [2];
        int eleccion, eleccion2, opcion;
        double cantidad, resultado;
        Cuenta operacion= new Cuenta();
        
        System.out.println("Desea modificar el saldo? true or false");
        inicio=teclado.nextBoolean();
        if (inicio){
            System.out.println("Cual de las "+cuentas.size()+" cuentas quiere modificar?");
            eleccion=teclado.nextInt();
            System.out.println("1-Ingreso 2-Reintegro 3-Transferencia");
            opcion=teclado.nextInt();
            System.out.println("Que cantidad?");
            cantidad=teclado.nextInt();

            switch (opcion){
               case 1:
                   resultado=operacion.ingreso(cantidad, cuentas.get(1-eleccion).getSaldo());
                   cuentas.get(1-eleccion).setSaldo(resultado);
                   break;
               case 2:
                   resultado=operacion.reintegro(cantidad, cuentas.get(1-eleccion).getSaldo());
                   cuentas.get(1-eleccion).setSaldo(resultado);
                   break;
               case 3:
                   System.out.println("A que cuenta desea mandar el dinero? ");
                   eleccion2=teclado.nextInt();
                   
                   result=operacion.transferencia(cantidad, cuentas.get(eleccion).getSaldo(),
                   cuentas.get(eleccion2).getSaldo());
                   
                   for (int contador=0; contador<2; contador++){
                       System.out.println("EL CONTENIDO DEL ARRAY ES... "+result[contador]);
                   }
                   cuentas.get(eleccion).setSaldo(result[0]);
                   cuentas.get(eleccion2).setSaldo(result[1]);
                   break;
                   
               default:
                   System.out.println("Opcion incorrecta");
                   break;
           }
           
        }
        for(int contador=0; contador<cuentas.size(); contador++){
            System.out.println(cuentas.get(contador));
        }
    }    
    
    
}
