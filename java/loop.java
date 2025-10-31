public class loop {

    public static void main(String[] args) {
        int i;
        int j;
        for(i=1; i<=10; i++){ // row
            for(j=1; j<=i; j++){ // column
                System.out.print("*");
            }
            System.out.println("*");

        }
    }
    
}
