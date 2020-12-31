package hamishaheerselection;
import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String [] args){
        //We have to borrow the library in our home
        Scanner input = new Scanner(System.in);
        double dblWeight; // declaring a variable for the weight
        System.out.print("Enter: ");
        dblWeight = input.nextDouble();
        
        double dblHeight; // declaring a variable for height
        System.out.print("");
        dblHeight = input.nextDouble();
        
        double dblBMI = dblWeight/(dblHeight * dblHeight); // calculating the BMI and storing it in a variable
        
        // conditions for BMI
        if (dblBMI > 25){
            System.out.println("Overweight");
        }
        if(dblBMI >= 18.5 && dblBMI <= 25){
            System.out.println("Normal weight");
        }
        if(dblBMI < 18.5){
            System.out.println("Underweight");
        }
    
    
    
    
    
    
    
    
    }
    
    
    
    
    
}
