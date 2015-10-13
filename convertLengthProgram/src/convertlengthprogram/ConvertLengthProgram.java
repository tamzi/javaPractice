/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package convertlengthprogram;

import java.util.Scanner;
/**
 *
 * @author tamre Frank
 */
public class ConvertLengthProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        float lengthInFeet;
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the length in feet");
        lengthInFeet=input.nextFloat();
        
        float lengthinCM;
        lengthinCM=(float) (lengthInFeet*30.48);
        System.out.println("The length you entered in cms is "+lengthinCM);
        
        
        
    }
}
