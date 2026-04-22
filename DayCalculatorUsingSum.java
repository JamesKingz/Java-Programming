import java.util.Scanner;

public class DayCalculatorUsingSum {
    public static void main(String[] args) {
//Accepting input_1
        System.out.println("Enter number: ");
        Scanner MyScanner = new Scanner(System.in);
        int Number = MyScanner.nextInt();
//Accepting input_2
        System.out.println("Enter the second Number: ");
        Scanner Myscanner = new Scanner(System.in);
        int Number2 = Myscanner.nextInt();
        int sum = Number + Number2;
        System.out.println();

// closing Scanner Util.
        MyScanner.close();
// Conditional statement to print when condition 1 is fulfilled

        if (sum<=5) {
         switch (sum) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                break;
        }   
        }
//If the condition is not fullfilled then the program will just print back the value to us
        else{
            System.out.println(sum);
        }
    }
}
