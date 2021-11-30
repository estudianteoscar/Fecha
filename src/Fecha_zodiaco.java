
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oscar
 */
public class Fecha_zodiaco {
    
    private int dia;
    private int mes;
    private int anio;
    
    //constructor fecha
    
    public Fecha_zodiaco(){
        
    }
    
    public Fecha_zodiaco(int dia, int mes, int anio){
        
        this.anio=anio;
        this.dia=dia;
        this.mes=mes;
    }
    
    //metodo get 

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }
    
    
    //metodo set

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    public String signoZodiaco(){
    String signo="";
    switch(mes){
        case 1:
            if(dia > 21){
         signo = "Acuario";
            }else {
         signo = "Capricornio";
            }
            break;
        case 2: 
            if(dia >19){
                 signo = "Piscis";
            }else{
                 signo = "Acuario";
            }
            break;
        case 3:
            if(dia>20){
                 signo ="Aries";
            }else{
                 signo ="Piscis";
            }
            break;
        case 4:
            if(dia >20){
                 signo = "Tauro";
            }else{
                 signo = "Aries";
            }
            break;
        case 5:
            if(dia >21){
                 signo ="Geminis";
            }else{
                 signo ="Tauro";
            }
            break;
        case 6:
            if(dia >20){
                 signo = "Cancer";
            }else{
                 signo = "Geminis";
            }
            break;
        case 7:
            if(dia >22){
                 signo = "Leo";
            }else{
                 signo ="Cancer";
            }
            break;
        case 8:
            if(dia >21){
                 signo ="Virgo";
            }else{
                 signo="Leo";
            }
            break;
        case 9:
            if(dia >22){
                 signo ="Libra";
            }else{
                 signo = "Virgo";
            }
            break;
        case 10:
            if(dia >22){
                 signo ="Escorpion";
            }else{
                 signo ="Libra";
            }
            break;
        case 11:
            if(dia >21){
                 signo = "Sagitario";
            }else{
                 signo = "Escorpion";
            }
            break;
        case 12:
            if(dia >21){
                 signo = "Capricornio";
            }else{
                 signo = " Sagitario";
            }
            break;
    }
        //String signo = null;
return signo; 
    
    
}
    public String getMeses(){
       
       Month mes = LocalDate.now().getMonth();

// Obtienes el nombre del mes
String nombre = mes.getDisplayName(TextStyle.FULL, new Locale("es", "ES"));
        return null;
        
    }
    
public String ifBisiesto(){
    String valor    = "";
    GregorianCalendar calendar = new GregorianCalendar();
    
    if(calendar.isLeapYear(anio)){
        System.out.println("El año es bisiesto");
        valor = "Bisiesto";
    }else{
        System.out.println("El año no es bisiesto");
        valor = "No bisiesto";
    }
    return valor;
}
    
    
//return valor;
    @Override
    public String toString(){
        return dia + " " +mes+ " " +anio;
    } 
}
