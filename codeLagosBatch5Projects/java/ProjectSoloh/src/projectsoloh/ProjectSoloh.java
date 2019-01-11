/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectsoloh;

import java.util.*;

/**
 *
 * @author HP
 */
public class ProjectSoloh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
  
        
        //System.out.println(p);
        int j;
        Scanner Store = new Scanner(System.in);
        
        System.out.print("\tWELCOME TO PROJECT CODE LAGOS!!!\n YOU ARE OUR NEXT BATCH OF INNOVATIVE PROGRAMMERS.\n");
        
        System.out.print("Input number of students: ");
        j = Store.nextInt();
        
        double [] Marks = new double [j];
        double sum = 0;
        
        System.out.println("Input marks for each student: ");
        for (int i = 0; i < j; i++)
        {
            System.out.print("Stundent["+(i+1)+"] = ");
            Marks[i] = Store.nextInt();
            sum += Marks[i];
        }
         double average = sum / j;
        System.out.println("Total mark of the class is: "+ sum); 
        System.out.println("Average mark of the class is: "+ average);
        
        if (average > 75)
        {
            System.out.println("HIGH PERFORMANCE!!!");
        }
        else if(average < 75 || average > 65)
        {
            System.out.println("THIS PERFORMANCE IS GREAT!!");
        }
        else if (average < 65 || average > 40)
        {
            System.out.println("AVERAGE PERFORMANCE");
        }else 
        {
            System.out.println("POOR, TRY AGAIN");
        }
    }
    
}
