/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tguca-L01
 */
public class guiaArreglos2 {
    
    public static void ejercicio1(int a[]){
        for(int k=0; k<=9; k++)
            System.out.println(a[k] + " ");
    }
    
    public static int ejercicio2(int a[]){
        int suma = 0;
        
        for(int j=0; j<=9; j++)
            suma = suma + a[j];
       
        return suma;
    }
    
    public static void ejercicio3(int a[]){
        for(int j=0; j<=a.length -1; j++){
            if(a[j] % 2 == 0)
                System.out.print(a[j] + "\n");
        }
    }
    
    public static void ejercicio4(int a[]){
        for(int j=0; j<=a.length -1; j++){
            if(a[j] % 2 != 0)
                System.out.print(a[j] + "\n");
        }
    }
    
    public static int ejercicio5(int a[]){
        int cont = 0;
        for(int j=0; j<=a.length -1; j++){
            if(a[j] % 2 == 0)
                cont ++;
        }
        return cont;
    }
    
    public static int ejercicio6(int a[]){
        int cont = 0;
        for(int j=0; j<=a.length -1; j++){
            if(a[j] % 2 != 0)
                cont ++;
        }
        return cont;
    }
    
    public static void main(String[] arg){
        int a[] = {24,39,19,36,22,57,91,16,73,45};
        
        //imprimiendo el arr
        ejercicio1(a);
        //sumando y retornando los numeros del arr
        System.out.println(ejercicio2(a));
        //imprimiendo todos los pares del arr
        ejercicio3(a);
        //imprimiendo todos los impares del arr
        ejercicio4(a);
        //contando los numeros pares del arr
        System.out.println(ejercicio5(a));
        //contando los numeros impares del arr
        System.out.println(ejercicio6(a));
        
    
    }
}
