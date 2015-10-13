/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package areaoftriangle;

import java.util.Scanner;

/**
 *
 * @author tamreFRANK
 */
public class AreaOfTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
        int base;
        int height;
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the base");
        base=input.nextInt();
        System.out.println("Please enter the height");
        height=input.nextInt();
        
        int area=base*height /2;
        System.out.print("the area of the triangle is "+area);
        
        
    }
}
