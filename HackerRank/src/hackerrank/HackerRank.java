/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

/**
 *
 * @author musharaf
 */
import java.util.Scanner;
public class HackerRank {

    /**
     * @param args the command line arguments
     */
    static double solve(double meal_cost, int tip_percent, int tax_percent) {
    double tip = (meal_cost * (tip_percent/100)) ;
    double tax = (meal_cost * (tax_percent/100));
    double totalCost = meal_cost + tip + tax;
    
    return Math.round(totalCost);
    }
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner;
        scanner = new Scanner(System.in);
         System.out.println("enter meal cost");
         double meal_cost = scanner.nextDouble();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println("enter tax percent");
        int tip_percent = scanner.nextInt();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println("enter tip percent");
        int tax_percent = scanner.nextInt();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.print(solve(meal_cost,tip_percent,tax_percent));
        scanner.close();
    }
    
}
