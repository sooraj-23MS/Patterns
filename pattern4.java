package patterns;

public class pattern4 {

    static void printpattern(int n)
    {
        
        for (int row = 0; row < n; row++) {
            int num=1;
            for (int col = 0; col <=row; col++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        /*
         1  
         1 2
         1 2 3
         1 2 3 4
         1 2 3 4 5
         */
        printpattern(5);
    }
}
