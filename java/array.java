public class array {
    public static void main(String[] args) {
        
        //inititalize arrray
        int [] a = new int[5];
        a[0]=10;
        a[1]=20;
        a[2]=30;
        a[3]=40;
        a[4]=50;

        //check the size of the array
        System.out.println("size of the array :"+a.length);

        //read value of the array
        System.out.println("Read the value of the array:"+a[3]);

        //read all the values of the array
        // for(int i=0; i<a.length; i++){
        //     System.out.println(a[i]);
        // }

        for(int i:a){
            
            System.out.print(i+ " ");
        }

    }
    
}

