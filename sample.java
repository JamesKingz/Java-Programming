//java library importation
import java.util.Scanner;

//declaration of class main
public class sample {

//initialtion
    public static void main(String[] args) {
        Scanner myScanner = new Scanner (System.in);
        System.out.println("Enter number: ");
        int Number = myScanner.nextInt();

        System.out.println("Hello, Number " + Number + "!");

        myScanner.close();
    
    }
}