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
    
    public static int ejercicio7(int a[]){
        int varSumadora = 0;
        
        for(int k=0; k <= a.length-1; k++){
            if(a[k]%2 == 0)
                varSumadora = varSumadora + a[k];
        }        
        return varSumadora;
    }
    
    public static int ejercicio8(int a[]){
        int varSumadora = 0;
        
        for(int l=0; l<= a.length - 1; l++){
            if(a[l]%2 !=0)
                varSumadora = varSumadora + a[l];
        }
        return varSumadora;
    }
    
    public static void ejercicio9(int a[]){
        for(int i = a.length-1; i>=0; i--)
            System.out.println(a[i]);
        
    }
    
    public static void ejercicio10(int a[]){
        for(int k=0; k<a.length;k++)
            if(a[k]%3==0){
                System.out.println(a[k]);
            }
    }
    
    public static int ejercicio11(int a[]){
        int varContadora= 0;
        for(int m =0; m<a.length;m++)
            if(a[m]%3==0)
                varContadora++;
        
        return varContadora;
    }
    
    public static int ejercicio12(int a[]){
        int varSumadora = 0;
        for(int i=0; i<a.length; i++)
            if(a[i]%3==0)
                varSumadora = varSumadora + a[i];
        
        return varSumadora;
    }
    
    public static int ejercicio13V1(int a, int b){
    
        return a - b;
    }
    
    public static int ejercicio13V2(int a[]){
        int varSumadorPares = 0;
        int varSumadorImpares = 0;
        int restaParesAImpares;
        
        for(int k=0; k<a.length; k++){
            if(a[k]%2==0) varSumadorPares = varSumadorPares + a[k];
            if(a[k]%2!=0) varSumadorImpares = varSumadorImpares + a[k];
        }
        
        return restaParesAImpares = varSumadorImpares - varSumadorPares;
        
    }
    
    public static void ejercicio14(int a[]){
       System.out.println("las pociciones pares a son: "); 
       for(int i=0;i<a.length;i++)
           if(i%2==0) System.out.println("pocicion:"+i+"valor: "+a[i]);
    }
    
    public static void ejercicio15(int a[]){
       System.out.println("las pociciones pares a son: "); 
       for(int i=0;i<a.length;i++)
           if(i%2!=0) System.out.println("pocicion:"+i+"valor: "+a[i]);
    }
    
    public static void ejercicio16(int a[]){
        for(int k=0; k<a.length; k++){
            if(a[k]>20) 
                System.out.println(a[k]);
        }
    }

    public static void ejercicio17(int a[]){
        for(int k=0; k<a.length; k++){
            if(a[k]<=50) 
                System.out.println(a[k]);
        }
    }

    public static void ejercicio18(int a[]){
        for(int k=0; k<a.length; k++){
            if(a[k] >20 && a[k]<=50) 
                System.out.println(a[k]);
        }
    }

   public static void ejercicio19(int a[]){
        for(int k=0; k<a.length; k++){
            if(a[k] >20 || a[k]<=50) 
                System.out.println(a[k]);
        }
    }
    
    public static void main(String[] arg){
        int a[] = {24,39,19,36,22,57,91,16,73,45};
        //          0     2     4     6     8
        
//        //imprimiendo el arr
//        ejercicio1(a);
//        //sumando y retornando los numeros del arr
//        System.out.println(ejercicio2(a));
//        //imprimiendo todos los pares del arr
          //ejercicio3(a);
//        //imprimiendo todos los impares del arr
//        ejercicio4(a);
//        //contando los numeros pares del arr
//        System.out.println(ejercicio5(a));
//        //contando los numeros impares del arr
//        System.out.println(ejercicio6(a));
//        //sumando los numeros pares del arr
          //System.out.print("Sumando los pares: ");
          //System.out.println(ejercicio7(a));
          //sumando todos los impares del arr
          //System.out.print("Sumando los impares: ");
          //System.out.println(ejercicio8(a));
          //imprima los numeros del arr en manera inversa
          //ejercicio9(a);
          //imprima los numeros divisibles de 3
          //ejercicio10(a);
          //contando los numeros divisibles entre 3
          //System.out.println(ejercicio11(a));
          //sumando los numeros divisibles de 3
          //System.out.println(ejercicio12(a));
          //restando los pares a los impares
          //System.out.print("La resta de los impares - pares es: ");
          //System.out.println(ejercicio13V1(ejercicio8(a), ejercicio7(a)));
          //System.out.print("La resta de los impares - pares es: ");
          //System.out.println(ejercicio13V2(a));
          //imprimiendo las posiciones pares del arr
          //ejercicio14(a);
          //imprimiendo las pociciones impares del arr
          //ejercicio15(a);
         //imprimiendo los numeros mayores a 20 del arr
         //ejerciciio16(a);
         //imprimiendo los numeros menores e iguales a 50
         //ejercicio17(a);
         //Imprima los numeros mayores a 20 y menores e iguales a 50 del arr
         //ejercicio18(a);
         //Imprima los numeros mayores a 20 o menores e iguales a 50 del arr
         ejercicio19(a);
    }
}
