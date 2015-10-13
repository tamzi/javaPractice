/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package converttemperatureprogram;

import java.util.Scanner;

/**
 *
 * @author tamreFRANK
 */
public class ConvertTemperatureProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        float temperatureInCentigrade;
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the temperature in centigrade");
        temperatureInCentigrade=input.nextFloat();
        
        float temperatureInFarenheit;
        temperatureInFarenheit=(float) (temperatureInCentigrade*33.8);
        System.out.println("The length you entered in degrees Farenheight is "+temperatureInFarenheit);
    }
}
