/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fisrtpractice;

/**
 *
 * @author User
 */
public class subclass {
     private int x; 
     private int y;
      int n = 5;
     
    public subclass(){}
       
   public  subclass(int x, int y)
   {
      this.x = x;
      this.y = y; 
    
   }    
   
   public int getValue()
   {
             return x + y;
   }
   
    public void doAdd()
    {
        System.out.println("answer = " + getValue());
       
    }
    
    public int loopDemo()
    { 
        int s = 1;
        int n = 5;
                for(int i = 0; i<=n; i++)
                {
                    s *= n;
                }
                System.out.println(s);
    return s;
    }
    
    public int factorial(int n)
    {
        if(n == 0)
        {
            return 1;
        }
        else
        {
            System.out.println(n);
            return n * factorial(n-1);
            
        }
    }
    public int fibonacci(int n)
    {
        if(n == 1)
        {
            return 1;
        }
        else if (n == 2)
        {
            return 1;
        }
        else
        {
            System.out.print(n);
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    
}

