/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edxmodule2project;

/**
 *
 * @author User
 */import java.util.Scanner;
    import java.util.Random;
public class EdxModule2Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        System.out.println("let\'s play a game called \"even and odd\" ");
        Scanner input = new Scanner(System.in);
        System.out.print("what is your name ? \t");
        String name = input.next();
        System.out.println("hello "+ name+"," +"which do you choose? (o)dds or (E)ven"  );
        String EvenOdd = input.next();
        int sum;
       
                
        
        if(EvenOdd.equals("o"))
        {
            System.out.println(name+" has picked odds! the computer will be evens!");
        }
        else if(EvenOdd.equals("e"))
        {
            System.out.println(name+" has picked even! the computer will be odds!");
        }
        else
        {
            System.out.println("sorry! wrong selection!");
        }
                {}
        System.out.println("-------------------------------------------------------------------");
        
        System.out.println("How many \"fingers\" do you put?");
        int userNumber = input.nextInt();
        
        Random rand = new Random();
        int computerNumber = rand.nextInt(6-1)+1;
        System.out.println("the computer plays number \"fingers\"");
        System.out.println("----------------------------------------------");
        
        sum = (userNumber + computerNumber);
        
        System.out.println(userNumber+" + "+computerNumber +" = "+sum );
        
       boolean oddOrEven = sum % 2 == 0;
        
        if(oddOrEven == true)
        {
            System.out.println(sum + " is Even!");
 
        }
        else{System.out.println(sum + " is Odd");}
        
        System.out.println("----------------------------------------------");
        
        if( userNumber % 2 == 0 || sum % 2 == 0)
        {
            System.out.println("evens!");
            
            System.out.println(name +" wins!");
            
        }else if(!(userNumber % 2 == 0)||!(sum % 2 == 0))
            {
                System.out.println("odds!");
                
                    System.out.println("computer Wins!");
                
            }
        /*
        

    */
         }
    }

