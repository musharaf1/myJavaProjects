/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edxmodule3project;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class EdxModule3Project {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        
        Scanner st = new Scanner(System.in);
        System.out.print("enter words here : ");
        String input = st.nextLine();
        //System.out.println(normalizeText(input));
        
        String newInput = normalizeText(input);
        
        //System.out.println(obify(normalizeText(input)));
        
        System.out.println(shiftAlphabet(newInput,2));
   
        
        /*makeFancy("java");
        System.out.println(makeFancy("java"));
        System.out.println(mystery (1));
      */
    }
      
    
    public static String normalizeText(String anything)
      
    {
            anything = anything.replaceAll("[^A-Za-z]", "");
            anything = anything.toUpperCase();
            return anything;
            
    }
    
    
    public static String obify(String obify_str)
    {
       
        String oby = "";
        for(int i = 0; i<obify_str.length(); i++)
        {
            char ch = obify_str.charAt(i);
            
            if(ch == 'A'||ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U'||ch == 'F' )
            {
               oby += "OB"+ch;
            }
            else
            {
                oby += ch;
            }
        }
        
        return oby;
    }
    
    public static String shiftAlphabet(String plainText,int shift)
    {
        
        if(shift>26)
        {
            shift = shift%26;
            
        }
        else if(shift<0)
        {
            shift = (shift%26)+26;
        }
        
        String cypherText = "";
        for(int i = 0; i<plainText.length(); i++)
        {
            char h = plainText.charAt(i);
            char c = (char)(h + shift);
            if(c >'Z')
            {
                cypherText += (char)((h)-(-26-shift));
            }
            else
            {
                cypherText += (char)c;
            }
        }
        return cypherText;
    }
}
     /*  
     public static String makeFancy(String s) {
    if (s.length() == 0) {
        return "*";
    }
    return "*" + s.substring(0,1) + makeFancy(s.substring(0, s.length()-1));
    
}

    public static int mystery (int x) {
    if (x == 5){
        return x;
    } else {
        return mystery(x--) * 5;
    }
}
*/
    

     
    
    

