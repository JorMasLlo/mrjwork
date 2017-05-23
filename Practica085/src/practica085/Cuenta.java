/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica085;

/**
 *
 * @author jordi
 */
public class Cuenta {
    private String nombre, apellido1, apellido2, dni, tipo_interes;
    private int opcion, numero_cuenta;
    private double cantidad, saldo, resultado;
    
    public Cuenta (){}//Constructor por defecto
        
    public Cuenta(String nombre, String apellido1,String apellido2,
           String dni,String tipo_interes, int numero_cuenta, double saldo, double cantidad){//Constructor con parametros
        this.nombre=nombre;
        this.apellido1=apellido1;
        this.apellido2=apellido2;
        this.dni=dni;
        this.tipo_interes=tipo_interes;
        this.numero_cuenta=numero_cuenta;
        this.saldo=saldo;
        this.cantidad=cantidad;
    }
     public Cuenta(Cuenta cuentas){//Constructor copia
        this.nombre=cuentas.nombre;
        this.apellido1=cuentas.apellido1;
        this.apellido2=cuentas.apellido2;
        this.dni=cuentas.dni;
        this.tipo_interes=cuentas.tipo_interes;
        this.numero_cuenta=cuentas.numero_cuenta;
        this.saldo=cuentas.saldo;
    }
     
    //Getters y Setters 
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getApellido1(){
        return apellido1;
    }
    public void setApellido1(String apellido1){
        this.apellido1=apellido1;
    }
    
    public String getApellido2(){
        return apellido2;
    }
    public void setApellido2(String apellido2){
        this.apellido2=apellido2;
    }
    
    public String getDni(){
        return dni;
    }
    public void setDni(String dni){
        this.dni=dni;
    }
    
    public String getTipo_interes(){
        return tipo_interes;
    }
    public void setTipo_interes(String tipo_interes){
        this.tipo_interes=tipo_interes;
    }
    
    public int getNumero_cuenta(){
        return numero_cuenta;
    }
    public void setNumero_cuenta(int numero_cuenta){
        this.numero_cuenta=numero_cuenta;
    }
    
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo=saldo;
    }
    public double getCantidad(){
        return cantidad;
    }
    public void setCantidad(double cantidad){
        this.cantidad=cantidad;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nNumero de cuenta: ");
        sb.append(numero_cuenta);
        sb.append("\nNombre: ");
        sb.append(nombre);
        sb.append("\nApellido: ");
        sb.append(apellido1);
        sb.append("\nApellido2: ");
        sb.append(apellido2);
        sb.append("\nDNI: ");
        sb.append(dni);
        sb.append("\nTipo de interes: ");
        sb.append(tipo_interes);
        sb.append("\nSaldo: ");
        sb.append(getSaldo());
        
        return sb.toString();
        
    }
    
    //Metodos 
    public double ingreso(double cantidad, double saldo){
        saldo=saldo+cantidad;
        return saldo;
    }
    public double reintegro(double cantidad, double saldo){
        do{
           saldo=saldo-cantidad; 
        }
        while(saldo<0 && cantidad>saldo);
        
        return saldo;
    }
    public double [] transferencia(double cantidad, double saldo, double saldo2){
        do{
           saldo=saldo-cantidad; 
           saldo2=saldo2+cantidad;
        }
        while(saldo<0 && cantidad>saldo);

        return new double [] {saldo, saldo2};
        
    }
}
