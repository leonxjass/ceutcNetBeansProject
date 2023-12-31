# ceutcNetBeansProject
//documentos de clase de programacion I ceutec

/*
laboratorio inicio de clases, archivo 1. imprimiendo datos, println(), atajo "Sout"; 

19/07 laboratorio 1, creacion de tablas, manipulacion y asignacion de variables 

ifCondicionales, optimizamos y creamos nuestro primer comentario

laboratorio 1, lo terminamos e implementamos condicionales

laboratorio 2, renovamos el lab1 e implementamos formatos

29/07 Hacemos nuestra primer tarea formulaCuadratica y el circo

31/07 vemos arreglos y como usar metodos en JAVA 

2/08 creamos el laboratorio 3 que parte del 1y2, solo que implementamos ciclos for y arreglos.

Entregamos tarea de metodos con el himno, y tarea de tabla aplicando arreglos y ciclos

4/08 contadores & sumadores con metodos,arr,for

7/08 iniciamos metodos en la libreria Math, String, aprendimos de metodos y funciones, guardando su valor en variables e imprimiendolas en una linea de System, iniciamos proyecto de calendario.

11/08 Realizamos prueba 1 de programacion

16/8 Iniciamos la Guia de Java para prepararnos para el examen

18/8 realizamos examen 

21/8 continuamos nuestro proyecto

30/08 iniciamos la guia del segundo periodo

1/09 avanzamos la guia 2 de arr hasta el ejer19

6/09 vimos el metodo arr en 2 dimensiones 

8/09 vimos metodo Scanner y JOptionPane con libreria javax o JAVA SWING

11/09 Metodo Bubble Sort conocido en la clase como swap, terminamos el ejercicio de menor a mayor

14/09 Se elabora la version 3 del proyecto del calendario, sujeta a generar una V4 para finalizar los requerimientos de la clase

*/


Claro, aquí tienes un ejemplo de un método en Java que ordena una matriz utilizando el algoritmo Bubble Sort:

```java
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Matriz antes de ordenar:");
        imprimirArray(array);

        bubbleSort(array);

        System.out.println("\nMatriz después de ordenar:");
        imprimirArray(array);
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Intercambia arr[j] y arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static void imprimirArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
```

Este código ordenará la matriz utilizando el algoritmo Bubble Sort y luego imprimirá la matriz ordenada. Puedes personalizar la matriz inicial modificando el contenido de la variable `array`.


Claro, aquí tienes un ejemplo de un método de ordenamiento Bubble Sort en Java que te permite ordenar un arreglo:

```java
public class BubbleSort {
    public static void main(String[] args) {
        int[] arreglo = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arreglo);
        System.out.println("Arreglo ordenado:");
        for (int i : arreglo) {
            System.out.print(i + " ");
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Intercambia arr[j] y arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
```

Este código implementa el algoritmo de ordenamiento Bubble Sort para ordenar un arreglo de números enteros. Puedes reemplazar el contenido del arreglo con los valores que desees ordenar. Cuando ejecutes el programa, mostrará el arreglo ordenado.