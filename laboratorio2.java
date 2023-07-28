/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author tguca-L01
 */
public class laboratorio2 {
        
  public static void main(String[] args){
    /*
        creando datos de tabla de productos && calculando datos    
    */
    
    //declarando variables
        String cp1, cp2, cp3, cp4, cp5;
        String np1, np2, np3, np4, np5;
        int c1, c2, c3, c4, c5;
        double p1, p2, p3, p4, p5;
        boolean g1, g2, g3, g4, g5;
        
        double st1, st2, st3, st4, st5;
        double imp1, imp2, imp3, imp4, imp5;
        double t1, t2, t3, t4, t5;
        double tp;
        
     
    //entrada de datos
        cp1 = "P01"; np1 = "QUESO";     c1 = 3; p1 = 47.50; g1 = false;
        cp2 = "P02"; np2 = "PAPAS";     c2 = 2; p2 = 08.45; g2 = false;
        cp3 = "P03"; np3 = "MARGARINA"; c3 = 1; p3 = 9.30;  g3 = true;
        cp4 = "P04"; np4 = "HUEVOS";    c4 = 2; p4 = 45.00; g4 = false;
        cp5 = "P05"; np5 = "CHILE(4OZ)";c5 = 3; p5 = 47.50; g5 = true;
    
    //definiendo formatos para print System.out.format
        String f1, f2, f3, f4, f5, f6, f7, f8, fg;
        f1 = "%-8s";
        f2 = "%-15s";
        f3 = "%-10d";
        f4 = "%-16.2f";
        f5 = "%-15b";
        f6 = "%-17.2f";
        f7 = "%-15.2f";
        f8 = "%-9.2f";
        fg = f1+f2+f3+f4+f5+f6+f7+f8+"\n";
    
    //Calculo de datos
        st1 = p1 * c1; 
        st2 = p2 * c2;
        st3 = p3 * c3;
        st4 = p4 * c4;
        st5 = p5 * c5; 
        
        imp1 = st1*0.15; 
        imp2 = st2*0.15; 
        imp3 = st3*0.15; 
        imp4 = st4*0.15; 
        imp5 = st5*0.15; 
        
        t1 = st1 + imp1;
        t2 = st2 + imp2;
        t3 = st3 + imp3;
        t4 = st4 + imp4;
        t5 = st5 + imp5;
        
        if(g1) imp1 = st1 * 0.15; else imp1 = 0;
        if(g2) imp2 = st2 * 0.15; else imp2 = 0;
        if(g3) imp3 = st3 * 0.15; else imp3 = 0;
        if(g4) imp4 = st4 * 0.15; else imp4 = 0;
        if(g5) imp5 = st5 * 0.15; else imp5 = 0;
    
        tp = t1+t2+t3+t4+t5;
        
    //output
        System.out.println("================================================="); 
        System.out.println("COD\tPRODUCTO   CANTIDAD\tPRECIO\t\tGRABABILIDAD"
                + "\tSUBTOTAL\tIMPUESTO\tTOTAL"); 
        System.out.println("================================================="); 
        System.out.format(fg,cp1,np1,c1,p1,g1,st1,imp1,t1); 
        System.out.format(fg,cp2,np2,c2,p2,g2,st2,imp2,t2); 
        System.out.println("================================================="); 
        System.out.println("Total a pagar" + tp); 
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

            Un 1Tab enquivale a 8 espacios habitualmente 
         
            **NOTA**
            Si no hacemos el salto de linea al final de un format el output 
            de los datos, nos resultara en una sola linea horizontal, 
            es necesario el final del formato el "\n"
         
            laboratorio 2
            
            
         
        */
    
    }
}
