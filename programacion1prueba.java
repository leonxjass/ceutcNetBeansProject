/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba1;

/**
 *
 * @author tguca-L01
 */
public class programacion1prueba {
    
    public static void main(String[] arg){
        //Declarando las variables de pi
        int a[]= { 1,4,1,5,9,2,6,5,3,5,8,9,7,9,3,2,3,8,4,6,2,6,4,3,3,8,3,2,7,9,5
                  ,0,2,8,8,4,1,9,7,1,6,9,3,9,9,3,7,5,1,0,5,8,2,0,9,7,4,9,4,4,5,9
                  ,2,3,0,7,8,1,6,4,0,6,2,8,6,2,0,8,9,9,8,6,2,8,0,3,4,8,2,5,3,4,2
                  ,1,1,7,0,6,7,9};
                
        //Declarando contandores las variables de pi
        int c0,c1,c2,c3,c4,c5,c6,c7,c8,c9;
        c0=c1=c2=c3=c4=c5=c6=c7=c8=c9=0;
        int sumaPi = 0;
        
        //Evaluando la cantidad de numeros de pi
        for(int j=0; j<= 99; j++){
            if(a[j] == 0) c0=c0 +1;
            if(a[j] == 1) c1=c1 +1;
            if(a[j] == 2) c2=c2 +1;
            if(a[j] == 3) c3=c3 +1;
            if(a[j] == 4) c4=c4 +1;
            if(a[j] == 5) c5=c5 +1;
            if(a[j] == 6) c6=c6 +1;
            if(a[j] == 7) c7=c7 +1;
            if(a[j] == 8) c8=c8 +1;
            if(a[j] == 9) c9=c9 +1;
            sumaPi = sumaPi + a[j];
        }
        //Salidad de Datos
        System.out.println("0 = " + c0);
        System.out.println("1 = " + c1);
        System.out.println("2 = " + c2);
        System.out.println("3 = " + c3);
        System.out.println("4 = " + c4);
        System.out.println("5 = " + c5);
        System.out.println("6 = " + c6);
        System.out.println("7 = " + c7);
        System.out.println("8 = " + c8);
        System.out.println("9 = " + c9);
        System.out.println("Suma de los 100 digitos de Pi = " + sumaPi);
        
        //Operacion de los datos
        int sumaF = c0+c1+c2+c3+c4+c5+c6+c7+c8+c9;
        System.out.println("Todas las Frecuencias = " + sumaF);
        
        double ps = sumaPi/100.0;
        System.out.println("Promedio de las sumas del ARR de Pi= " + ps);
    }
}
