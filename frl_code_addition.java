import java.util.Scanner;
public class AddTwoNumbers2 {

    public static void main(String[] args) {
        
        int num1, num2, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 st Number: ");
        num1 = sc.nextInt();
        
        System.out.println("Enter 2 nd  Number: ");
        num2 = sc.nextInt();
        
        sc.close();
        sum = num1 + num2;
        System.out.println("Sum of these numbers: "+sum);
    }
}
class Division
{
   public static void main(String args[])
   {
      int p, q, r;
      System.out.println("Enter 2 integers for Division: ");
      Scanner sc = new Scanner(System.in);   
      p = sc.nextInt();   
      q = sc.nextInt();
      r = p / q;
      System.out.println("Division of the integers = "+r);
   }
}
Output:
