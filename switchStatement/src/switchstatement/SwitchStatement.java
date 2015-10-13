package switchstatement;
import java.util.Scanner;
 /**
 *
 * @author tamreFRANK
 */
public class SwitchStatement {

    /**
     * @param args the command line arguments
     */
   
    
    public static void main(String[] args)
    {
        // TODO code application logic here
    int marks=0;
    Scanner input=new Scanner(System.in);
    System.out.println("enter the marks scored");
    marks=input.nextInt();
    
    switch(marks)
    {
        case 70:
            System.out.print("marks=70");
            break;
        case 80:
            System.out.print("marks=80");
            break;
        default:
            System.out.print("marks not factored");
            
            
        } 
                
        
    }
    
    
    
    

    }

