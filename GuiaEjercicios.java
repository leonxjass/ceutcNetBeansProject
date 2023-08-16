package aaaa;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tguca-L01
 */
public class GuiaEjercicios {
    
    public static void ejer1(int c){
        
    /**
     * Le damos una cantidad al programa y nos retorna cuantos billetes de cada
     * denominacion se necesitan para obtener esa cantidad.
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
    
    public static void main(String[] arg){
        System.out.println();
        ejer1(8797);
    }
}
