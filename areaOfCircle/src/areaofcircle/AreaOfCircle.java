/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package areaofcircle;

import java.util.Scanner;

/**
 *
 * @author tamreFRANK
 */
public class AreaOfCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    
        // TODO code application logic here
    
        float radius;
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the radius");
        radius=input.nextFloat();
        
        float area;
        area=(float) (radius*3.147*radius);
        System.out.println("The area of the circle with the radius you entered is "+area);

    }
}
        