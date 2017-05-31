/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica090;

/**
 *
 * @author jordi
 */
public class NIF {
    private int DNI;
    private char letra;
    
    public NIF(){}
    
    public NIF(int DNI){
        this.DNI=DNI;
        calculo();
    }
    
    private void calculo(){
        String serie="TRWAGMYFPDXBNJZSQVHLCKE";
        int resto=this.DNI%23;
        this.letra=serie.charAt(resto);
    }
    
    public int getDNI(){
        return DNI;
    }
    public  void setDNI(int DNI){
        this.DNI=DNI;
        calculo();
    }
    public char getLetra(){
        return letra;
    }
    public  void setLetra(char letra){
        this.letra=letra;
    }
}
