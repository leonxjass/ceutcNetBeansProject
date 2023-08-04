/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivostxt;

/**
 *
 * @author tguca-L01
 */
public class contadoresSumadores {
   
    public static void e1(){
        int c = 0; 
        int x1,x2,x3,x4,x5,x6,x7,x8,x9,x10;
        x1=1;x2=2;x3=3;x4=4;x5=5;x6=6;x7=7;x8=8;x9=9;x10=10;
        
        if(x1 % 2 == 0) c=c+1;
        if(x2 % 2 == 0) c=c+1;
        if(x3 % 2 == 0) c=c+1;
        if(x4 % 2 == 0) c=c+1;
        if(x5 % 2 == 0) c=c+1;
        if(x6 % 2 == 0) c=c+1;
        if(x7 % 2 == 0) c=c+1;
        if(x8 % 2 == 0) c=c+1;
        if(x9 % 2 == 0) c=c+1;
        if(x10% 2 == 0) c=c+1;
        
        System.out.println("c = " + c);
    }
    public static void e2(double modulo){
        int x[] = {1,2,3,4,5,6,7,8,9,10};
        int c = 0;   
        for(int k=0; k <= 9; k++)
            if(x[k]%modulo==0) c = c+1;
        System.out.println("pares:" + c);
    }
    public static void e3(){
    int y[] = {1,2,3,4,5,6,7,8,9,10};
    int s = 0;
    for(int l=0; l<=9; l++)
        s = s + y[l];
    System.out.println("suma el arr: " + s);
    }
    
    public static void main(String[] arg){
      e3();
    }
}

    /**
     * e2 tiene la capacidad de sacar los divisibles aleatorios que el usuario 
     * escoja, le pasamos un numero llamado en el metodo como modulo que se 
     * aplica al condicional dentro del ciclo for ej_ x[k] % modulo(2) == 0
     * - e1 & e2 corresponden al tema de contadores
     * e3 pertenece al tema de los sumadores
    */