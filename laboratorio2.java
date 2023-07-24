/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class Repaso2 {
    
    public static void main(String[] args){
         /*
        creando datos de tabla de productos    
    */
    
    //declarando variables
        String cp1, cp2, cp3, cp4, cp5;
        String np1, np2, np3, np4, np5;
        int c1, c2, c3, c4, c5;
        double p1, p2, p3, p4, p5;
        boolean g1, g2, g3, g4, g5;
    
    //entrada de datos
        cp1 = "P01"; np1 = "QUESO";     c1 = 3; p1 = 47.50; g1 = false;
        cp2 = "P02"; np2 = "PAPAS";     c2 = 2; p2 = 08.45; g2 = false;
        cp3 = "P03"; np3 = "MARGARINA"; c3 = 1; p3 = 9.30;  g3 = true;
        cp4 = "P04"; np4 = "HUEVOS";    c4 = 2; p4 = 45.00; g4 = false;
        cp5 = "P05"; np5 = "CHILE(4OZ)";c5 = 3; p5 = 47.50; g5 = true;
    
    //definiendo formatos para print System.out.format
        String f1, f2, f3, f4, f5, fg;
        f1 = "%-8s";
        f2 = "%-15s";
        f3 = "%-10d";
        f4 = "%-16.2f";
        f5 = "%-55b";
        fg = f1+f2+f3+f4+f5+"\n";
        
        
    //output
        System.out.println("================================================="); 
        System.out.println("COD\tPRODUCTO   CANTIDAD\tPRECIO\t\tGRABABILIDAD"); 
        System.out.println("================================================="); 
        System.out.format(fg,cp1,np1,c1,p1,g1); 
        System.out.format(fg,cp2,np2,c2,p2,g2);
        System.out.format(fg,cp3,np3,c3,p3,g3); 
        System.out.format(fg,cp4,np4,c4,p4,g4); 
        System.out.format(fg,cp5,np5,c5,p5,g5); 
        System.out.println("================================================="); 

        
       
    }
    
    public static void comments(){
    
         /* Semana 1
            para que la tabla este completamente pareja, aplicamos un tab
            adcional a las lineas 3,4,5 ya que los nombres de los productos 
            son mas largos y nos quitan el alineamiento.
        */
        
        /*  Semana 2
            para definir un formato se inicia ("") entre comillas, seguido por 
            un porcentaje (%) mas el signo de alineacion (-), depues ancho de
            columna + el tipo; eje. "%-5s" la "s, d, f" define que es una var de tipo
            String, decimal(int), f(float), b(boolean).
            
            En los decimales, el numero despues del punto determina cuantos 
            digitos decimales utilizaremos en este caso "2" para que nos 
            retorne eje. 12.50
         
            **NOTA**
            Si no hacemos el salto de linea al final de un format el output 
            de los datos, nos resultara en una sola linea horizontal, 
            es necesario el final del formato el "\n"
         
        */
    
    }
}
