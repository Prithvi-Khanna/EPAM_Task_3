import Model.CalculationException;
import Model.Operands;

import java.util.Scanner;

public class RunApplication {

    public static void main(String strngs[]) throws CalculationException {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int choice=0;
        Operands operands = new Operands(a,b);
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("Enter a number of your choice");
        choice = s.nextInt();
        operands.Calculation(choice);
    }
}
