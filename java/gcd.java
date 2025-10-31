
import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first nunber");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();



    }

    public static int com(int num , int num2){
        int i =1;
        while(i<num2){
            if(i%num==0 && i%num2==0){
                return i ;
            }
                i++;
            }
    }
    
}
