
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
            System.out.println("Please enter number :");
            int num = sc.nextInt();

            for (int i = 0; i <= num; i++) {
             if(num%2 !=0){
                System.out.println(i);
             }
             i++;
            
            }

        // boolean result = prime(num);
        // if(result){
        //     System.out.println("It is a prime number");
        //     }
        // else{
        //     System.out.println("It is not a prime number");
        // }
    }

    // public static boolean prime(int num){
    //     if(num<2){
    //         return false;
    //     }
    //     int i =2;
    //     while(i<num){
    //         if(num%i==0){
    //             return false;
    //         }
    //             i++;
    //         }
        
    //     return true;
    // }


    
}
