import java.util.Scanner;

public class Quadratic_equation {
    public static void main(String[] args) {
// The scanner utility to allow user input:
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double number = myScanner.nextDouble();

        System.out.println("Enter the Second number: ");
        double number2 = myScanner.nextDouble();

        System.out.println("Enter the third number: ");
        double number3 = myScanner.nextDouble();
// myScanner.close(); is an instruction variable that show that the scanner input ends here;
        myScanner.close();

//The third part of the equation: This segment solves the b^2- 4ac part of the equation;
        double x = (number2*number2) - 4*(number*number3);

// The inclusion of the math.sqrt method helps to provide squareroot of the specified variable in this case (x) above;
        double solution = (-number2 + Math.sqrt(x)) / (2 * number);
        double solution2 = (-number2 - Math.sqrt(x)) / (2 * number);
        System.out.println("Answer to the quadratic equation is:" + " " + solution + "  " + solution2);
    }
}
