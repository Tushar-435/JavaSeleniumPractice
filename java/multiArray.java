public class multiArray {
    public static void main(String[] args) {
        
        // int [][] a= new int[3][2];
        // a[0][0]=12; // row col =0
        // a[0][1]=13; // row col = 0,1

        // a[1][0]=14; // row col = 1,0
        // a[1][1]=15; // row col = 1,1

        // a[2][0]=16; // row col = 2,0
        // a[2][1]=17; // row col = 2,1

        int[][] a = {{12,13},{14,15},{16,17}};

        System.out.println("number of rows:"+ a.length); 
        System.out.println("number of columns:"+ a[0].length);
    }
    
}
