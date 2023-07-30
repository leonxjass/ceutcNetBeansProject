/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algorithmiaejer;

/**
 *
 * @author pc
 */
public class tarea2 {
    public static void formulacuadratica(int a, int b, int c){
        
    // formula (-b±√(b²-4ac))/(2a) 
        
        //definimos variables de formula d, x & y ;
        int d;
        double x1,x2;
        double y;
        
        //calculando al formula
        d = b*b - 4*a*c;
        
        //Evaluamos si la formula tiene solucion
        if(d >= 0){
            x1 = (-b + Math.sqrt(d))/(2*a); 
            x2 = (-b - Math.sqrt(d))/(2*a); 
            
            System.out.println("x1 >> " + x1);
            System.out.println("x2 >> " + x2);
        }else{
            System.out.println("No hay solucion\n");
        }
            
        //imprimimos tabla grafica de x & y    
        System.out.println("\nGrafico de la funcion" + 
                    "\nx \t y");
        
        for(int x = - 7; x <= 5; x++){
            y = x*x + 2*x - c;
            System.out.println(x + "\t" + y);
        }
        
    }
    
    public static void ejercicioDelCirco(){
        
        
        //declarando valores de voletos por categoria
        int pBN = 90; 
        int pBM = 180; 
        int pBH = 210;
        
        //declarando variables
        int tfm1, tfm2, tfm3, tfm4, tfm5;
        int bn1, bn2, bn3, bn4, bn5;
        int bm1, bm2, bm3, bm4, bm5;
        int bh1, bh2, bh3, bh4, bh5;
        
        //Asignando valores a los datos
        bn1=3; bn2=2; bn3=3; bn4=1; bn5=4;
        bm1=1; bm2=2; bm3=1; bm4=3; bm5=2;
        bh1=2; bh2=1; bh3=1; bh4=2; bh5=2;
        
        //Creando calculos 
        int tbn = bn1+bn2+bn3+bn4+bn5; 
        int tbh = bh1+bh2+bh3+bh4+bh5;
        int tbm = bm1+bm2+bm3+bm4+bm5;
        
        int tn1 = bn1 * pBN;  int tm1 = bm1 * pBM; int th1 = bh1 * pBH;
        int tn2 = bn2 * pBN;  int tm2 = bm2 * pBM; int th2 = bh2 * pBH;
        int tn3 = bn3 * pBN;  int tm3 = bm3 * pBM; int th3 = bh3 * pBH;
        int tn4 = bn4 * pBN;  int tm4 = bm4 * pBM; int th4 = bh4 * pBH;
        int tn5 = bn5 * pBN;  int tm5 = bm5 * pBM; int th5 = bh5 * pBH;
        
        tfm1 = tn1 + tm1 + th1; 
        tfm2 = tn2 + tm2 + th2;
        tfm3 = tn3 + tm3 + th3;
        tfm4 = tn4 + tm4 + th4;
        tfm5 = tn5 + tm5 + th5;
        int ttf = tfm1+tfm2+tfm3+tfm4+tfm5; 
        
        int ttn = tn1+tn2+tn3+tn4+tn5;
        int ttm = tm1+tm2+tm3+tm4+tm5;
        int tth = th1+th2+th3+th4+th5;
       
        int n1,n2,n3,n4,n5,n6,n7,n8;
        n1=1;n2=2;n3=3;n4=4;n5=5;n6=6;n7=7;n8=8;
        
        //Definiendo formatos generales
        String f1,f2,f3,f4,f5,f6,f7,f8,fg,fh;
        f1 = "%-6d";
        f2 = "%-10d";
        f3 = "%-10d";
        f4 = "%-7d";
        f5 = "%-8d";
        f6 = "%-10d";
        f7 = "%-11d";
        f8 = "%-8d";
        fg = f1+f2+f3+f4+f5+f6+f7+f8+"\n";
        
        //Formatos para la ultima linea de la tabla
        String f11= "Total:";
        fh = f11+f2+f3+f4+f5+f6+f7+f8+"\n";
        f11 = "%-10s";
        
        System.out.println("==============================================");
        System.out.println("#  cNiños  cMujeres  cHombres  tNiños  tMujeres  "
        + "tHombres  tFamilia");
        System.out.println("==============================================");
        System.out.format(fg,n1,bn1,bm1,bh1,tn1,tm1,th1,tfm1);
        System.out.format(fg,n2,bn2,bm2,bh2,tn2,tm2,th2,tfm2);
        System.out.format(fg,n3,bn3,bm3,bh3,tn3,tm3,th3,tfm3);
        System.out.format(fg,n4,bn4,bm4,bh4,tn4,tm4,th4,tfm4);
        System.out.format(fg,n5,bn5,bm5,bh5,tn5,tm5,th5,tfm5);
        System.out.println("==============================================");
        System.out.format(fh,tbn,tbm,tbh,ttn,ttm,tth,ttf);
       
    }
    
    public static void main(String[] args) {
        
        //le pasamos 3 valores enteros
        formulacuadratica(1,2,-15);
        //solamente ejecutamos el metodo
        ejercicioDelCirco();
    }
}
