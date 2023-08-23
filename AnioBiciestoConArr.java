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
public class AnioBiciesto {
    
    public static int biciesto(int año){
        
        if(año %100 == 0)
            if(año %400 == 0)
                return 1;
            else
                return 0;
        else
            if(año%4==0)
                return 1;
            else 
                return 0;
    }
    
    public static void  main(String[] arg){
        int año = 2023;
        int añoBiciesto[] = {848,1900,1972,1984,2000,2023,2024};

        for(int k = 0; k <= añoBiciesto.length -1 ; k++)
            System.out.println("El año " + añoBiciesto[k] + "es " + biciesto(añoBiciesto[k]));
        
        
        biciesto(año);
        
    }
}
