/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codelagos;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class CodeLagos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/*    int i = 17;
    double y = 17;
    float k = 15;
    char d = 'd';
    boolean bool = false;
    String name = "hello";
        System.out.println(i);
        System.out.println(y);
        System.out.println(k);
        System.out.println(d);
        System.out.println(bool);
        System.out.println(name);
        

// simple mathematical operation

 int num1,num2;
 double anser;
 
 
 num1 = 50;
 num2 = 70;
 anser = num1 + num2;
 System.out.println(anser);
 
    */
 Scanner input = new Scanner(System.in);
        double answer;
        System.out.println("enter first number");
        int num1 = input.nextInt();
        System.out.println("enter second number");
         int num2 = input.nextInt();
         answer = num1 + num2;
        System.out.println(answer);
    
    
    
    }
    
}
