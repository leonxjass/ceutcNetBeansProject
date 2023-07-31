/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tguca-L01
 */
public class arraysJavaSemana3 {
    
    public static void arreglos(){
    
        int x[]  = new int[5];
        x[0] = 20;
        x[1] = 11;
        x[2] = 90;
        x[3] = 70;
        x[4] = 95;
        //System.out.println(x.length);
        
        int y[] = {1,2,3,4,5,6,7,8,9,10};
        
        System.out.println("x  y");
        
        for(int k = 0; k <= 4; k++)
            System.out.println(x[k] +" "+ y[k]);
            System.out.println("long x: " + x.length);
            System.out.println("long y: " + y.length);
    
    }
    
    public static void main(String[] arg){
        
        arreglos();
    }

    public static void comments(){
        /*
         podemos llamar a las casillas en lugar de un numero especifico
         decimos que n(equivale al tamanio del arr) y le restamos la posicion
         ejemplo si queremos acceder al ultimo elemento en el arr seria n-1
         esto de manera grafica seria 5-1 que seria la casilla 4 dentro del arr,
         
         metodos para imprimir arr: https://www.freecodecamp.org/espanol/news/como-imprimir-arreglos-en-java/
        
        */
    }
}
