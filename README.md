# FRL-lab2
We have made 4 programs for addition, subtraction, multiplication and division.
And after that we will integrate all the codes into single file and make a calculator.
import java.util.Scanner;
public class multiplyTwoNumbers2 {

    public static void main(String[] args) {
        
        int num1, num2, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        num1 = sc.nextInt();
        
        System.out.println("Enter Second Number: ");
        num2 = sc.nextInt();
        
        sc.close();
        result = num1 * num2;
        System.out.println("Multiplication of these numbers: "+result);
    }
}
