/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradecalculator1;
import java.util.*;
/**
 This Grade calculator can be use to get grade of students on each course.
 It works by accepting user input for numbers of student to calculate for, 
 Name of student, score in test and Exam. It then calculate the total score, grade the score, output the total score and grade.
 * It then repeat the process for every other students.
 */
public class Gradecalculator1 {
 public static void main(String[] args) {
 
  System.out.println(" This Grade calculator can be use to get grade of students on each course.");
System.out.println(" It works by accepting user input for numbers of student to calculate for, ");
System.out.println(" Name of student, score in test and Exam. It then calculate the total score, grade the score, output the total score and grade.");
System.out.println(" It then repeat the process for every other students.");

     //To Accept the Number of Student in the Class
 Scanner student = new Scanner (System.in);
  System.out.println("Enter the Number of Students that took part in Course " + "\t");
 int a = student.nextInt();
 
 double sum;
 int num[] = new int[a];
 int i;
 for (i=0; i<a; i++){
 
  
     Scanner name = new Scanner (System.in);
     System.out.println("Enter the Full Name of Students" );
     String N = name.next();
     
     System.out.println("Enter Test Score for Student" + (i+1));
     Scanner test = new Scanner(System.in);
     double Testscore = test.nextDouble();
             
     System.out.println("Enter Exam Score for Student" + (i+1));
     Scanner Exam = new Scanner(System.in);
     double Examscore = Exam.nextDouble();
   
     sum = Testscore + Examscore;
         
 if(sum>75 && sum<=100){
 System.out.println( N + "\t" + sum + "\t" + " A1");
 }
 else if(sum>70 && sum<=75){
 System.out.println( N + "\t" + sum + "\t" + " A2");  
 }
 else if(sum>60 && sum<=70){
 System.out.println( N + "\t" + sum + "\t" + " B1");
 }
 else if(sum>55 && sum<=60){
 System.out.println( N + "\t" + sum + "\t" + " B2");
 }
 else if(sum>50 && sum<=55){
 System.out.println( N + "\t" + sum + "\t" + " C1");
 }
 else if(sum>45 && sum<=50){
 System.out.println( N + "\t" + sum + "\t" + " C2");
 }
 else if(sum>40 && sum<=45){
 System.out.println( N + "\t" + sum + "\t" + " D1");
 }
 else if(sum>30 && sum<=40){
 System.out.println( N + "\t" + sum + "\t" + " D2");
 }
 else if(sum>0 && sum<=30){
 System.out.println( N + "\t" + sum + "\t" + " F");
 }
 else{
 System.out.println("Your Score input is incorrect, Please recheck your score input...");
 }
 System.out.println( " ");
 }
 
 } 
 
 
}
