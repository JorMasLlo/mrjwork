/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica089;

import java.util.Calendar;
import java.util.Locale;
import java.util.regex.Pattern;

/**
 *
 * @author jordi
 */
public class FechaReal {
    private String dia, mes, año;
    
    public FechaReal(){}
    
    public FechaReal(String dia, String mes, String año){
        this.dia=dia;
        this.mes=mes;
        this.año=año;
        comprobar();
    }
    
    public String getDia(){
        return dia;
    }
    public  void setDia(String dia){
        this.dia=dia;
    }
    
    public String getMes(){
        return mes;
    }
    public  void setMes(String mes){
        this.mes=mes;
    }
    
    public String getAño(){
        return año;
    }
    public  void setAño(String año){
        this.año=año;
    }
    
    public void comprobar(){
        
        boolean checkDia, checkMes, checkAño;
        int mesint=Integer.parseInt(mes);

        checkMes=Pattern.matches("^(0[1-9]|1[0-2])$", mes);
        checkAño=Pattern.matches("^([0-1]?[0-9]{3}|1[0-9]{3}|200[0-9]|201[0-7])$", año);

        if (mesint==2){
           checkDia=Pattern.matches("^([1-2]?[0-9]|0[1-9])$", dia); 
        }
        else if ((mesint<8 && mesint%2==0)||(mesint>7 && mesint%2!=0)){
            checkDia=Pattern.matches("^([1-2]?[0-9]|0[1-9]|30)$", dia);
        }
        else if ((mesint>7 && mesint%2==0)||mesint<8){
            checkDia=Pattern.matches("^([1-3]?[0-9]|0[1-9]|31)$", dia);
        }
        else{
            checkDia=false;
        }
        
        
        if(checkMes&&checkDia&&checkAño){
            String fechatotal=dia+"/"+mes+"/"+año;
            System.out.println("La fecha "+fechatotal+" es valida");
            fechasistema();
            
        }
        else{
            System.out.println("La fecha NO es valida. Vuelve a Stringentarlo");
            fechasistema();
        }
    }
    
    public void fechasistema(){
        Calendar c = Calendar.getInstance();
        dia=Integer.toString(c.get(Calendar.DATE));
        mes=Integer.toString(c.get(Calendar.MONTH));
        año=Integer.toString(c.get(Calendar.YEAR));
        System.out.println("La fecha actual es esta "+dia+"/"+mes+"/"+año);
        
    }
}
