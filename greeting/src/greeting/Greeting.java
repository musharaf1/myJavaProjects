/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greeting;

/**
 *
 * @author musharaf
 */
import java.util.*;
public class Greeting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a yoruba name ");
        String yorName = input.next();
        NiajaGreeings greet = new NiajaGreeings();
        greet.yorubaGre();
        System.out.println(greet.yorubaGre()+" mr/mrs "+yorName);
        
        //math op = new math();
        
       
    }
    
}

 class NiajaGreeings{
     
     void hausaGre(){
         System.out.println("yaya ne?");
     }
     void igboGre(){
         System.out.println("Ndewo nnu o");
     }
     String yorubaGre(){
         return "ekaaaro!";
     }
 }
     
    
 
