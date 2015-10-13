/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package convertmetresprogram;

import java.util.Scanner;

/**
 *
 * @author tamreFRANK
 */
public class ConvertMetresProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
    
        float distanceInKilometres;
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the distance in Kilometres");
        distanceInKilometres=input.nextFloat();
        
        float distanceInMetres;
        distanceInMetres=(float) (distanceInKilometres*1000);
        System.out.println("The length you entered in metres "+distanceInMetres);
    }
}
