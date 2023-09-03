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
        public static void header(int a){
        System.out.println("\n\nEjercicio #" + a
        + "\n==========================================");
    }

    public static void ejercicio1(int a[]){
        header(1);
        System.out.println("los numeros del arreglo a son:");
        for(int k=0; k<=9; k++)
            System.out.print(a[k] + " ");
    }
    
    public static int ejercicio2(int a[]){
        int suma = 0;
        
        for(int j=0; j<=9; j++)
            suma = suma + a[j];
       
        return suma;
    }
    
    public static void ejercicio3(int a[]){
        header(3);
        System.out.println("Los numeros pares del arreglo son: ");
        for(int j=0; j<=a.length -1; j++){
            if(a[j] % 2 == 0)
                System.out.print(a[j] + "\n");
        }
    }
    
    public static void ejercicio4(int a[]){
        header(4);
        System.out.println("Los numeros impares del arrglo son:");
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
        header(9);
        System.out.println("Orden inverso del arreglo A");
        for(int i = a.length-1; i>=0; i--)
            System.out.print(a[i]+" ");
        
    }
    
    public static void ejercicio10(int a[]){
        header(10);
        System.out.println("Los numeros divisibles %3 del arreglo A");
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
        
        return restaParesAImpares = varSumadorPares - varSumadorImpares;
        
    }
    
    public static void ejercicio14(int a[]){
       header(14);
       System.out.println("Imprimiendo las pociciones pares de A[i]"); 
       for(int i=0;i<a.length;i++)
           if(i%2==0) System.out.println(i+" = "+a[i]);
    }
    
    public static void ejercicio15(int a[]){
       header(15); 
       System.out.println("Imprimiendo las pociciones impares de A[i]"); 
       for(int i=0;i<a.length;i++)
           if(i%2!=0) System.out.println(i+" = "+a[i]);
    }
    
    public static void ejercicio16(int a[]){
       header(16);
       System.out.println("Imprimiendo los numeros >20 de A[i]");
       
       for(int k=0; k<a.length; k++){
            if(a[k]>20) 
                System.out.println(a[k]);
            }
        }

    public static void ejercicio17(int a[]){
        header(17);
        System.out.println("Imprimiendo los numeros <=50 de A[i]");
        for(int k=0; k<a.length; k++){
            if(a[k]<=50) 
                System.out.println(a[k]);
        }
    }

    public static void ejercicio18(int a[]){
        header(19);
        System.out.println("Imprimiendo los numeros >20 y <=50 de A[i]");
        for(int k=0; k<a.length; k++){
            if(a[k] >20 && a[k]<=50) 
                System.out.println(a[k]);
        }
    }

    public static void ejercicio19(int a[]){
       header(20);
       System.out.println("Imprimiendo los numeros >20||<=50  de A[i]");
       
       for(int k=0; k<a.length; k++){
            if(a[k] >20 || a[k]<=50) 
                System.out.println(a[k]);
        }
    }
    
    public static void ejercicio20(int a[], int b){
        
        /**
         * donde a[i] es el recorrido del arreglo &
         * b es el numero que deseamos encontrar.
        */
    
        header(20);
        System.out.println("Encontrando un numero x dentro de A[i]");
        System.out.println("\nNumero a encontrar: " + b);
        
        int numeroEncontrado=0;
        int contadorPosicion=0;
        
        for(int k=0; k<a.length;k++){
            if(a[k] == b)
                contadorPosicion= contadorPosicion + k;
                numeroEncontrado ++;
        }
        
        if(numeroEncontrado > 0)
            System.out.println("\nNumero: " + b + " Encontrado en la pocisicion: "
                    + contadorPosicion + " del arreglo a[i]");
        else 
            System.out.println("\nNumero: "+ b +" no encontrado en ninguna "
                    + " parte del arreglo");
        
        
       
    }
    
    public static void main(String[] arg){
        int a[] = {24,39,19,36,22,57,91,16,73,45};
        //          0     2     4     6     8
        
//        //imprimiendo el arr
//        ejercicio1(a);
//        
//        //sumando y retornando los numeros del arr
//        header(2);
//        System.out.println("la suma de todos los numeros del arreglo "
//                + "es: "+ejercicio2(a));
//        
//        //imprimiendo todos los pares del arr
//        ejercicio3(a);
//        
//        //imprimiendo todos los impares del arr
//        ejercicio4(a);
//        
//        //contando los numeros pares del arr
//        header(5);
//        System.out.println("contando los numeros pares del arreglo "
//                + "es: "+ejercicio5(a));
//        
//        //contando los numeros impares del arr
//        header(6);
//        System.out.println("contando los numeros impares los numeros del arreglo "
//                + "es: "+ejercicio6(a));
//        
//        //sumando los numeros pares del arr
//        header(7);
//        System.out.println("sumando los numeros pares los numeros del arreglo "
//                + "es: "+ejercicio7(a));
//
//        //sumando todos los impares del arr
//        header(8);
//        System.out.println("sumando los numeros impares los numeros del arreglo "
//                + "es: "+ejercicio8(a));
//        
//        //imprima los numeros del arr en manera inversa
//        ejercicio9(a);
//        
//        //imprima los numeros divisibles de 3
//        ejercicio10(a);
//        
//        //contando los numeros divisibles entre 3
//        header(11);
//        System.out.println("contando los numeros divisibles %3 del arreglo "
//                + "son: "+ejercicio11(a));
//        
//        //sumando los numeros divisibles de 3
//        header(12);
//        System.out.println("la suma de los numeros %3 del arreglo"
//                + "son: "+ejercicio12(a));
//
//        //restando los pares a los impares
//        //System.out.println(ejercicio13V1(ejercicio8(a), ejercicio7(a)));
//        header(13);
//        System.out.println("restando a la suma de los pares la suma de los impares "
//                + "es: "+ejercicio13V2(a));
//        
//        //imprimiendo las posiciones pares del arr
//        ejercicio14(a);
//        //imprimiendo las pociciones impares del arr
//        ejercicio15(a);
//        //imprimiendo los numeros mayores a 20 del arr
//        ejercicio16(a);
//        //imprimiendo los numeros menores e iguales a 50
//        ejercicio17(a);
//        //Imprima los numeros mayores a 20 y menores e iguales a 50 del arr
//        ejercicio18(a);
//        //Imprima los numeros mayores a 20 o menores e iguales a 50 del arr
//        ejercicio19(a);
         //encontrando 1 numero x dentro del arreglo
         ejercicio20(a, 45);

    
    } 
}
