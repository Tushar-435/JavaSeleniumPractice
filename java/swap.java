
import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        // int a = 10;
        // int b = 20;

        // System.out.println("Before swapping:");
        // System.out.println("a = " + a);
        // System.out.println("b = " + b);

        // // Swapping logic
        // int c = a;
        // a = b;
        // b = c;

        // System.out.println("\nAfter swapping:");
        // System.out.println("a = " + a);
        // System.out.println("b = " + b);


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number first");
        int num1 = sc.nextInt();
        System.out.println("Enter number second");
        int num2 = sc.nextInt();

        num1= num1+num2;
        num2 = num1-num2;
        num1 = num2-num1;
        System.out.println("swapping two numbers"+ num1 + " " + num2);

    }

}
