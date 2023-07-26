/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion1;

/**
 *
 * @author tguca-L01
 */
public class ciclosProgramacion1 {
    
    public static void divisores(int a, int b, int c){
        int j = a;
        int h = b;
        int l = c;
        
        //manipulando ciclos en java
        for(int i=j; i<=c; i++)
            /*
            System.out.println("juan\n" + "pedro" //imprime nombres y var
            + "Variable i vale: " + i);
            */
            //System.out.println(i*2); //pares entre 0 y 20
            if(i%h == 0)
                System.out.println(i); //imprimiendo i si es par
    
    }
    
    public static void funtion(){
        
        double y;
        System.out.println("x" + "\t" + "Y");
        
        for(int x =-3; x<=5; x++){
            //y = 3*x*x + 4*x - 5;
            y = 3*Math.pow(x,2) + 4*x - 5;
            System.out.println(x + "\t" + y);
        }
        
        System.out.println("Raiz de 2 " + Math.sqrt(3));
    }
    
    public static void main(String[] arg){
        divisores(1,2,10); // pasamos 3 datos para calcular los divisores
        //funtion();
            
    }
        
}
