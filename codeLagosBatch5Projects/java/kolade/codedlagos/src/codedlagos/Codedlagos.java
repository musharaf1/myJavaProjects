/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codedlagos;
/**
 *
 * @author kolly
 */
import java.util.Arrays;
 import java.util.Scanner;
 import java.util.Random;
//import java.util.* ;

public class Codedlagos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
       
       /* 
        double val, valu, answer ;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number");
        val = input.nextDouble();
        System.out.println("Enter your second number");
        valu = input.nextDouble();
        answer = val + valu ;
        System.out.println(answer);   
       */
       
       // if statement 
      /*
       int age;
       int num;
       String country;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age:");
        age = input.nextInt();
          if(age>18){
              System.out.println( "what is your card number ? ");
              int cardnum = input.nextInt();   
           if(cardnum < 5000){
               Scanner coun = new Scanner(System.in);
           System.out.println("Enter your country:");
           country = coun.nextLine();
           if( "nigeria".equals(country)){
           System.out.println( "\nyou are from " +country);
           System.out.println( "\nyou are eligible as you are from the selected country");
           System.out.println( "\nwelcome to the world of civilisation !!!");
           }
           else
           System.out.println( "\nyou are not eligible,not from the selected country");
           }
            else      
                 System.out.println( "card number not valid.....thank you, Goodbye!!!"); 
          }
          else
                 System.out.println( "sorry you are not of age to participate!!!");
        */  
        /*
        // class work for simple calculator 27/11/2018
        
       int num, num2, answer ;
       Scanner input = new Scanner(System.in);
       System.out.println("Enter any number");
       num= input.nextInt();
       System.out.println("Enter another number");
        num2= input.nextInt();
        answer = num * num2;
        System.out.println( answer);
        */
        // TODO code application logic here
    /*
    int x=20;
    
    System.out.println(x);
    
    double fnum;
        fnum = 56.2;
    double amount = x + fnum ;
    
     System.out.println(amount);
     
     float fnumb ;
        fnumb =(float)  (amount * fnum) ;
     System.out.println(fnumb);
    */
   /* 
    Scanner input = new Scanner (System.in);
    System.out.println("Enter your first name :");
        String name1 = input.next();
        System.out.println("Enter your second name :");
        String name2 = input.next();
    System.out.println("\n your full name is :" +name1+"-"+name2+"." );
    System.out.println( "\n Thank you for learning JAVA !!!\n" );
    */
    
   // to output random numbers such as dice
   
 /*  Random rand = new Random();
   int number = rand.nextInt(6) +1;
   System.out.println(number);
   */


 
 // MY CODELAGOS PROJECT, TITLED: G.G.GAME
 // KNOWN AS GUESSING GAMER GAME @ 13-12-2018
 
    System.out.println( "WELCOM TO THE G.G.G\nGUESSING GAMER GAME  !!!" );
    System.out.println( "PLEASE, WE WOULD LIKE TO KNOW YOU BETTER  \n" );
    Scanner nam = new Scanner(System.in);
    System.out.println( "WHAT IS YOUR FULL NAME:" );
     String name = nam.nextLine();
   
    System.out.println( "HOW OLD ARE YOU:" );
    int age = nam.nextInt();

   //RETRICTION BY AGE  
     if(age>18){
       System.out.println( "THANKS, YOU ALMOST THERE !" ); 
       Scanner coun = new Scanner(System.in);
       System.out.println( "WHICH COUNTRY ARE YOU FROM:" );
        String country = coun.nextLine();
  // RETRICTION BY COUNTRY      
    if("nigeria".equals(country)||"togo".equals(country)||"ghana".equals(country)){
       System.out.println( "YOUR ACCOUNT DETAILS:" );
   // int[] account = new int[n];
       System.out.println( "ENTER ACCOUNT NUMBER:" );
       int account=nam.nextInt();
   // account[n]=nam.nextInt();
       System.out.println( "ENTER YOUR BANK NAME:" );
       Scanner ban = new Scanner(System.in);
       String bank = ban.nextLine();
       System.out.println( "CONGRATS YOU CAN NOW PLAY THE GAME !" );
       System.out.println( "SIT BACK AND RELAX TO ENJOY THE GAMING!" );
   // THE GAME SECTION
    for(int i=0; i<3; i++){
        Scanner game = new Scanner(System.in);
        System.out.println( "GUESS A NUMBER :" );
        int guess = game.nextInt();
         Random rand = new Random();
        int number = rand.nextInt(6) +1;
         System.out.println(number);
       // CHECKING VALUES  
     if(guess==number){
            System.out.println( "\n-------------------------------------------------------" );
          
            if(null != country)switch (country) {
                case "nigeria":
                    System.out.println( "WOW! CONTRATULATIONS, YOU WON THE MASTERING GAMER" );
                    System.out.println( "CASH OF naira 100,000 WOULD BE TRANSFERED TO YOUR ACCOUNT,SOONEST" );
                    System.out.println( "YOUR DETAILS IS AS FOLLOW:" );
                    System.out.println( "NAME:\t"+ name );
                    System.out.println( "AGE:\t"+ age );
                    System.out.println( "COUNTRY:\t"+ country );
                    System.out.println( "BANK DETAILS:\t"+ account+"  "+bank );
                    break;
                case "ghana":
                    System.out.println( "WOW! CONTRATULATIONS, YOU WON THE MASTERING GAMER" );
                    System.out.println( "CASH OF cede 100,000 WOULD BE TRANSFERED TO YOUR ACCOUNT,SOONEST" );
                    System.out.println( "YOUR DETAILS IS AS FOLLOW:" );
                    System.out.println( "NAME:\t"+ name );
                    System.out.println( "AGE:\t"+ age );
                    System.out.println( "COUNTRY:\t"+ country );
                    System.out.println( "BANK DETAILS:\t"+ account+"  "+bank );
                    break;
                case "togo":
                    System.out.println( "WOW! CONTRATULATIONS, YOU WON THE MASTERING GAMER" );
                    System.out.println( "CASH OF franc 100,000 WOULD BE TRANSFERED TO YOUR ACCOUNT,SOONEST" );
                    System.out.println( "YOUR DETAILS IS AS FOLLOW:" );
                    System.out.println( "NAME:\t"+ name );
                    System.out.println( "AGE:\t"+ age );
                    System.out.println( "COUNTRY:\t"+ country );
                    System.out.println( "BANK DETAILS:\t"+ account+"  "+bank );
                    break;
                default:
                    break;
            }
     break;
            }
     // WHEN GUESSING FAILS
     else 
         System.out.println( "LAUGHING\tLAUGHING\tLAUGHING\n" ); 
         while(i==2){
          System.out.println( "YOU CANT BE SMARTER THAN THE MASTERING GAMER" );   
          System.out.println( "GAME OVER" );
           System.out.println( "BYE BYE !!!" );
          break;
         }
        }
    // NOT FROM THE SELECTED COUNTRIES
           }
      else{
        System.out.println( "YOU ARE NOT FROM THE SELECTED COUNTRIES !...BYE BYE" );
        }      
      // NOT MATURE ENOUGH  
         }
     else{
    System.out.println( "SORRY, YOU ARE UNDER AGE\n TRY AGAIN NEXT YEAR:" );
         }
        
     // END OF THE GAME........THANKS FOR THE PARTICIPATION
    }
    
    }
