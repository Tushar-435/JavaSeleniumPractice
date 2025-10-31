public class  Fibonacci {
    public static void main(String[] args) {
       // int n = 10; // Number of terms in the Fibonacci series to generate
    //     System.out.println("Fibonacci series up to " + n + " terms:");
    //     for (int i = 0; i < n; i++) {
    //         System.out.print(fibonacci(i) + " ");
    //     }
    // }

    // Recursive method to calculate the nth Fibonacci number
    // public static int fibonacci(int n) {
    //     if (n <= 1) {
    //         return n;
    //     }
    //     return fibonacci(n - 1) + fibonacci(n - 2);
    // }
        int n = 10; // Number of terms in Fibonacci series
        int a = 0;  // first term
        int b = 1;  // second term
        System.out.print("Fibonacci series up to " + n + " terms: ");
    for(int i = 0; i<=n; i++){
        System.out.print(a + " "); // print current term
        int c = a+b;
        a = b;
        b = c;
    
    }

}
}