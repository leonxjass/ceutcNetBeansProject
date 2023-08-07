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
public class metodos3 {
    
    public static void ej1(){
        
        /**
         * Creamos ejemplos de metodos matematicos, y creamos ejemplos
         * de metodos para comparar caracteres de cadenas, dado a que 
         * el comparador == es unicamente para valores numericos y no 
         * para cademas.
        */
        double x,y;
        x = 2;
        y = Math.sqrt(x);
        System.out.println("la raiz de x es: " + y);
        
        y = Math.pow(x, 3);
        System.out.println("x elevado al cubo es: " + y);
        
        String s1, s2;
        s1="Casado";
        s2="Soltero";
        if(s1.equals(s2)){
            System.out.println("son iguales");
        }else System.out.println("no son iguales");
        
        System.out.println("comparando cadenas" + s1.compareTo(s2));
    
    }
    public static void suma(int a, int b){
        /**
         * metodo que permite recibir dos parametros enteros y suma los dos 
         * valores y retorna un impresion en cosola con el resultado.
        */
        System.out.println("la suma de: " + a +  " y " + b
        +" es igual a " + (a+b));
    }
    public static int fsuma(int a, int b){
    /**
     * ejemplo de una funcion, a diferencia de los metodos (Void), las funciones
     * pueden devolver directamente un valor, en este caso la suma aceptara dos
     * parametros enteros, ya que la funcion es de tipo int. 
     * **Nota** las funciones siempre debe retornar un valor, de lo contrario
     * se enoja JAVA, nos da error y nos regagnia
    */
        return a + b;
    }
    public static double cubox(double x){
        /**
         * esta funcion recibe un parametro double para elevar un numero a su
         * potencia, definido por el metodo pow! - pasando el parametro cuando
         * llamamos a la funcion cubo(x)
        */
    return Math.pow(x, 3);
    }
    
    public static void main(String[] arg){
    
    suma(32,25); //-> este es un metodo
    //probando la funcion    
    System.out.println("llamando una fsuma de 8+9 = " + fsuma(8,9));
    
    //capturando el return en una var
    int retn = fsuma(9,9);
    System.out.println("retornamos retn pasando 9 + 9 = " + retn);
    
    //funcion que eleva al cubo un numero
    //double y = 5; - > si y solo si quisieramos pasar el valor a la fcubox
    System.out.println("El numero 5 al cubo es: " + cubox(5));
    
    }

}
