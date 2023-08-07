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
    
    public static void main(String[] arg){
        int dia = 0;
        
        System.out.println("Do\tLu\tMa\tMi\tJu\tVi\tSa");
        
        for(int c=1; c<=42; c++){
            if(c>=6)//4
                dia = dia + 1; //1
            System.out.print(dia + "\t");
            if(c%7 == 0)System.out.println(""); // 2
        }       
        //salto de linea
        System.out.println("");//3
    }
}

/**
 * 2) lo utilizamos para que nuestros dias empiezen en la casilla 3
 * 1) lo usamos para imprimir los saltos de linea
 * para crear las casillas del calendario
 * 3) lo usamos para que el sistema haga un salto de linea y se 
 * creen las filas y que no lo imprima como una sola fila
 * controlamos en que dia de la semana inicia el mes
 */
