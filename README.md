# FRL-lab2
We have made 4 programs for addition, subtraction, multiplication and division.
And after that we will integrate all the codes into single file and make a calculator.
import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {
        
        int num1, num2, result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        num1 = sc.nextInt();
        
        System.out.println("Enter Second Number: ");
        num2 = sc.nextInt();
        
        sc.close();
        result = num1 * num2;
        System.out.println("Multiplication of these numbers: "+result);
        result1= num1 - num2;
        System.out.println("Subtract of these numbers: "+result1);
        result2= num1 + num2;
        System.out.println("Sum of these numbers: "+result2);
        result3 = num1 /num2;
        System.out.println("Division of the integers = "+result3);
    }
}
