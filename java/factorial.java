import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int num = readNum();
        int result = factorial(num);
        System.out.println("Factorial of " + num + " is: " + result);
        int result1 = factorial1(num);
        System.out.println("Factorial of " + num + " is: " + result1);
        
    }

    public static int readNum(){
    Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter here :");

        int num  = sc.nextInt();
        return num;
    }

    public static int factorial(int num){
        int fact = 1;
        for (int i =1; i<=num; i++){
            fact *= i;
        }
        return fact;
        }

    public static int factorial1(int num){
        int fact = 1;
        int i = 1;
        while (i<=num){
            fact *= i;
            i++;
        }
        return fact;
    }


}
