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
    public static void main(String[] arg){
        System.out.println();
        //ejer1(8797);
        //ejer4();
        ejer5();
    }
}
