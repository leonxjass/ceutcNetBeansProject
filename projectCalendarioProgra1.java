/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication600;

/**
 *
 * @author tguca-L01
 */
public class projectCalendarioProgra1 {
   
    public static void cal1(){
        int dia = 0;
        
        System.out.println("Do\tLu\tMa\tMi\tJu\tVi\tSa");
        
        for(int c=1; c<=42; c++){
            if(c>=6)
                dia = dia + 1; //1
            //if(dia>31) break;
            System.out.print(dia + "\t");
            if(c%7 == 0)System.out.println(""); // 2
        }       
        //salto de linea
        System.out.println("");//3
    
    }

    public static void anioBiciesto(int elec){
        int anio = elec;
        
        if(anio % 4 == 0){
            if(anio % 100 == 0){
                if(anio % 400 == 0){
                    System.out.println("Anio Biciesto");
                }else{
                    System.out.println("No es biciesto");
                }
            }else{
                System.out.println("Anio biciesto");
            }
        }else{
            System.out.println("No es biciesto");
        }
    }

    public static void main(String[] arg){
        //cal2("Enero", 0,31);
        String mes[] = {"","Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio"
            ,"Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        int ds[] = {0,0,3,3,6,1,4,6,2,5,0,3,5};
        int dm[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        
        for(int k=1; k<13; k++)
            cal2(mes[k],ds[k],dm[k]);
       /*
        System.out.println(mes.length);
        System.out.println(ds.length);
        System.out.println(dm.length);
       */
    }
}

/**
 * **NOTA: Valido para el cal1 nada mas**
 * 2) lo utilizamos para que nuestros dias empiezen en la casilla 3
 * 1) lo usamos para imprimir los saltos de linea
 * para crear las casillas del calendario
 * 3) lo usamos para que el sistema haga un salto de linea y se 
 * creen las filas y que no lo imprima como una sola fila
 * 
 **NOTA2 el cal2 es el mismo solo que retomado desde cero**
 * aplicamos la regla de negocio que el calendario debe iniciar en el dia de la
 * semana 5, en este caso viernes, lo logramos creando una variable que contenga
 * el valor numerico del dia y le decimos que la casilla sume 1 si la casilla es 
 * menor que la var iniDiames que le sume 1, detemos la iteracion diciendole
 * que si dia es menor que el tDiaMes no siga imprimiendo
 */
