/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author leonxjass
 */
public class GuiaEjercicios {
    
    public static void ejer1(int c){
        
    /**
     * Le damos una cantidad al programa y nos retorna cuantos billetes de cada
     * denominacion se necesitan para obtener esa cantidad
    */    
    int cantidad = c;
    int b500=500, b200=200, b100=100, b50=50, b20=20,b10=10,b5=5,b2=2,b1=1;
    int c500,c200,c100,c50,c20,c10,c5,c2,c1;
    int st500,st200,st100,st50,st20,st10,st5,st2,st1;
    int s1, s2,s3,s4,s5,s6,s7,s8,s9;
    
    c500 = cantidad/b500;
    st500= b500*c500;
    s1 = cantidad - st500;
    
    c200 = s1/200;
    st200 = b200*c200;
    s2 = s1 - st200;
    
    c100 = s2/200;
    st100=b100*c100;
    s3=s2-st100;
    
    c50 = s3/50;
    st50= b50*c50;
    s4=s3-st50;
    
    c20 = s4/20;
    st20= b20*c20;
    s5=s4-st20;
    
    c10 = s5/10;
    st10= b10*c10;
    s6=s5-st10;
    
    c5 = s6/5;
    st5= b5*c5;
    s7=s6-st5;
    
    c2 = s7/2;
    st2= b2*c2;
    s8=s7-st2;
    
    c1 = s8/1;
    st1= b1*c1;
    s9=s8-st1;
    
    int tg=st1+st2+st5+st10+st20+st50+st100+st200+st500;
    
    System.out.println("Billetes\tCant\tSubT\tsobrante\n"+
    b500+"\t\t"+c500+"\t"+st500+"\t"+s1+"\n"+
    b200+"\t\t"+c200+"\t"+st200+"\t"+s2+"\n"+
    b100+"\t\t"+c100+"\t"+st100+"\t"+s3+"\n"+
    b50+"\t\t"+c50+"\t"+st50+"\t"+s4+"\n"+
    b20+"\t\t"+c20+"\t"+st20+"\t"+s5+"\n"+
    b10+"\t\t"+c10+"\t"+st10+"\t"+s6+"\n"+
    b5+"\t\t"+c5+"\t"+st5+"\t"+s7+"\n"+
    b2+"\t\t"+c2+"\t"+st2+"\t"+s8+"\n"+
    b1+"\t\t"+c1+"\t"+st1+"\t"+s9);
        System.out.println("Total \t\t\t\t" + tg);
    }
    
    public static void ejer4(){
        int largo[] = {0,7,5,8,9,12};
        int ancho[] = {0,4,5,3,9,6};
        String Area[] = {"Area 1","Area 2","Area 3", "Area 4", "Area 5",};
        
        System.out.println("No\tLargo\tAncho\tArea\tPerimetro\tfigura");
        System.out.println("=========================================");
       
        for(int j=1; j<=5; j++){
            System.out.println(j+"\t "+largo[j]+"\t "+ancho[j]+"\t "
                    +(largo[j]*ancho[j])+"\t "+((2*largo[j])+(2*ancho[j]))
                    +"\t\tRectangulo");
        }
    
    }
    public static void ejer5(){
        
        String pd[] = {"P1","P2","P3","P4","P5"};
        int mes1[]  = {12,17,28,14,21}; 
        int mes2[]  = {13,15,14,18,17}; 
        int mes3[]  = {20,16,17,11,19}; 
        int tm1=0,tm2=0, tm3=0,tm4=0,tm5=0, txv=0;
         
        System.out.println("Prod\tMes 1\tMes 2\tMes 3\tTotal");
        System.out.println("--------------------------------");
        for(int k=0;k<5;k++){
            System.out.println(pd[k]+"\t"+mes1[k]+"\t"+mes2[k]+"\t"+mes3[k]
            +"\t"+(mes1[k]+mes2[k]+mes3[k]));
            tm1= tm1+mes1[k]; 
            tm2= tm2+mes2[k]; 
            tm3= tm3+mes3[k];
        }
        System.out.println("Total\t"+tm1+"\t"+tm2+"\t"+tm3+"\t"+(tm1+tm2+tm3));
        System.out.println("Prome\t"+(tm1/5)+"\t"+(tm2/5)+"\t"+(tm3/5)+"\t"
        +((tm1+tm2+tm3)/5));
        
    }

    public static void ejer8(){
        
        /**
         * El dueño de un circo lo ha contratado a usted para que haga un 
         * programa que controle la caja de la boletería El programa deberá 
         * reportar el total a pagar por familia y el total al final del día 
        */
        
        //declarando valores de voletos por categoria
        int pBN = 90; 
        int pBM = 180; 
        int pBH = 210;
        
        //Asignando valores a los datos
        int bn1=3; int bn2=2; int bn3=3; int bn4=1; int bn5=4;
        int bm1=1; int bm2=2; int bm3=1; int bm4=3; int bm5=2;
        int bh1=2; int bh2=1; int bh3=1; int bh4=2; int bh5=2;
        
        //Creando calculos 
        int tbn = bn1+bn2+bn3+bn4+bn5; 
        int tbh = bh1+bh2+bh3+bh4+bh5;
        int tbm = bm1+bm2+bm3+bm4+bm5;
        
        int tn1 = bn1 * pBN;  int tm1 = bm1 * pBM; int th1 = bh1 * pBH;
        int tn2 = bn2 * pBN;  int tm2 = bm2 * pBM; int th2 = bh2 * pBH;
        int tn3 = bn3 * pBN;  int tm3 = bm3 * pBM; int th3 = bh3 * pBH;
        int tn4 = bn4 * pBN;  int tm4 = bm4 * pBM; int th4 = bh4 * pBH;
        int tn5 = bn5 * pBN;  int tm5 = bm5 * pBM; int th5 = bh5 * pBH;
        
        int tfm1 = tn1 + tm1 + th1; 
        int tfm2 = tn2 + tm2 + th2;
        int tfm3 = tn3 + tm3 + th3;
        int tfm4 = tn4 + tm4 + th4;
        int tfm5 = tn5 + tm5 + th5;
        int ttf = tfm1+tfm2+tfm3+tfm4+tfm5; 
        
        int ttn = tn1+tn2+tn3+tn4+tn5;
        int ttm = tm1+tm2+tm3+tm4+tm5;
        int tth = th1+th2+th3+th4+th5;
       
        int n1=1;int n2=2;int n3=3;int n4=4;int n5=5;int n6=6;int n7=7;int n8=8;
        
        //encapsulamos los resultados para que lo lea un for y hacer solo 1 Sys
        int arrbn[] = {bn1,bn2,bn3,bn4,bn5};
        int arrbm[] = {bm1,bm2,bm3,bm4,bm5};
        int arrbh[] = {bh1,bh2,bh3,bh4,bh5};
        int arrtn[] = {tn1,tn2,tn3,tn4,tn5};
        int arrtm[] = {tm1,tm2,tm3,tm4,tm5};
        int arrth[] = {th1,th2,th3,th4,th5};
        int arrtfm[] = {tfm1,tfm2,tfm3,tfm4,tfm5};
        int arrn[] = {1,2,3,4,5};
        
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
        for(int i = 0; i < 5; i++){
            System.out.format(fg,arrn[i],arrbn[i],arrbm[i],arrbh[i],
                    arrtn[i],arrtm[i],arrth[i],arrtfm[i]);}
        System.out.println("==============================================");
       
        System.out.format(fh,tbn,tbm,tbh,ttn,ttm,
                          tth,ttf);
    }
    public static int areaCuadradoX(int x){
        /**
         * Dado un cuadrado de lado X, haga una función que retorne el área 
         * del cuadrado, la cualestá definida como A = X^2
        */
        return x*x;
    }
    public static int AreaRectángulo(int l1, int l2){
        /**
         * Dado un rectángulo de Lados L1 y L2, haga una función que retorne 
         * el área del rectángulo, la cual está definida como A = L1*L2
        */
        return l1*l2;
    }
    public static int TotalDinero(int b500,int b200,int b100,int b50,int b20,int b10,int b5,int b2,int b1){
        /**
         * Dado el número de billetes de 500, 200, 100, 50, 20, 10, 5, 2 y 1, 
         * haga una función llamada TotalDinero(b500, b200, b100, b50, b20, 
         * b10, b5, b2, b1) que retorne la cantidad total de dinero
        */
        int bl500 = b500*500;
        int bl200 = b200*200;
        int bl100 = b100*100;
        int bl50 = b50*50;
        int bl20 = b20*20;
        int bl10 = b10*10;
        int bl5 = b5*5;
        int bl2 = b2*2;
        int bl1 = b1*1;
        
        int suma = bl500+bl100+bl50+bl20+bl10+bl5+bl2+bl1;
        
        return suma;
    }
    public static void main(String[] arg){
        System.out.println();
        //ejer1(8797);
        //ejer4();
        ejer5();
        ejer8();
        //ejercicio 9 de la guia de ejercicios.
        System.out.println("Area cuadrada: "+areaCuadradoX(5));
        //ejercicio 10 de la guia de ejercicios.
        System.out.println("Area Rectangulo "+AreaRectángulo(8,12));
        //ejercicio 11 de la guia de ejercicios.        
        int printb = TotalDinero(5,0,2,0,2,1,0,3,0);
        System.out.println("tiene en total: " + printb);
        ejer13();
    }
}
