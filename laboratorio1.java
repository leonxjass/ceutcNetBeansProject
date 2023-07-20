/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class laboratorio1 {
    
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
    
    //output
        System.out.println(cp1+"\t"+np1+"\t\t"+c1+"\t"+p1+"\t"+"\t"+g1); //espaciado x2 con \t\t
        System.out.println(cp2+"\t"+np2+"\t\t"+c2+"\t"+p2+"\t"+"\t"+g2); //espaciado x2 con \t\t
        System.out.println(cp3+"\t"+np3+"\t"  +c3+"\t"+p3+"\t"+"\t"+g3);
        System.out.println(cp4+"\t"+np4+"\t\t"+c4+"\t"+p4+"\t"+"\t"+g4); //espaciado x2 con \t\t
        System.out.println(cp5+"\t"+np5+"\t"  +c5+"\t"+p5+"\t"+"\t"+g5);
        
        
        /*
            para que la tabla este completamente pareja, aplicamos un tab
            adcional a las lineas 3,4,5 ya que los nombres de los productos 
            son mas largos y nos quitan el alineamiento.
        */
    
    }
}
