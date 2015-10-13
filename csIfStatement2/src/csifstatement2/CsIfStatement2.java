/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package csifstatement2;

import java.util.Scanner
/**
 *
 * @author tamreFRANK
 */
public class CsIfStatement2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
   {
            // TODO code application logic here
    float temperature ;
    Scanner input=new Scanner(System.in);
    System.out.println("enter the milk temperature");
    temperature=input.nextInt();
    
    if (temperature>40)
  {
      System.out.println("dont give the baby milk");
  }
    else if (temperature>30 && temperature<40)
  {
     System.out.println("give the baby milk"); 
  }  
    else  (temperature<30 && )
   {
     System.out.println("Dont feed the baby.Warm the milk first");  
   }
   
   }
    
}
