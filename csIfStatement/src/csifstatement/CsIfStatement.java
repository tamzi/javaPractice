/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package csifstatement;

import java.util.Scanner;
/**
 *
 * @author tamreFRANK
 */
public class CsIfStatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        float age;
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter age");
        age=input.nextInt();
                
        if (age < 18) 
     {
        System.out.println("cannot vote");
        System.out.println("is a minor");
      } 
        else 
      {
          System.out.println("can vote");
          System.out.println("is an adult");
      }  
      }      
    }
