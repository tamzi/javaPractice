/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rectanglearea;

import java.util.Scanner;

/**
 *
 * @author tamreFRANK
 */
public class RectangleArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
        int length;
        int width;
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the length");
        length=input.nextInt();
        System.out.println("Please enter the width");
        width=input.nextInt();
        
        int area=length*width;
        System.out.print("the area of the rectangle is "+area);
        
        
    }
}
