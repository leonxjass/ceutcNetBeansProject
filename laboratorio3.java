/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion3;

/**
 *
 * @author tguca-L01
 */
public class laboratorio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /**
         * Creamos un arr para cada una de las variables en las cuales
         * podremosn iterar dentro de un bucle for.
        */
        
        String cp[] = {"P01","P02","P03","P04","P05"};
        String np[] = {"QUESO","PAPAS","MARGARINA","HUEVOS","CHILE(4oz)"};
        int c[] = {3,2,1,2,3};
        double p[] = {47.50,8.45,9.30,45.00,7.20};
        boolean g[] = {false,false,true,false,true};
        
        double st[] = {0,0,0,0,0};
        double imp[] = {0,0,0,0,0};
        double t[] = {0,0,0,0,0};
        double tp = 0;
        
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
        
        System.out.println("================================================="); 
        System.out.println("COD\tPRODUCTO   CANTIDAD\tPRECIO\t\tGRABABILIDAD"
                + "\tSUBTOTAL\tIMPUESTO\tTOTAL"); 
        System.out.println("=================================================");
        
        /**
         * Creamos un ciclo For que calcule todas subTotal, determine si g es 
         * t/f para calcular el impuesto, total & total productos.
         */
        
        for(int i =0; i<5; i++){
            st[i] = p[i]*c[i];
            if(g[i])imp[i]= st[i]*0.15; else imp[i]=0;
            t[i] = st[i] * imp[i];
            tp = tp + t[i];
            
        System.out.format(fg,cp[i],np[i],c[i],p[i],g[i],st[i],imp[i],t[i]);}
        System.out.println("================================================="); 
        System.out.println("Total a pagar " + tp); 
        System.out.println("================================================="); 
     }
    
}