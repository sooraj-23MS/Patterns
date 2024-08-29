package patterns;

public class pattren3 {

    static void printpattern( int n)
    {
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n-row; col++) {
                System.out.print("* ");
            }
            System.out.println(" ");
            
        }
    }
    public static void main(String[] args) {
        /*
         * * * * * *  
         * * * * *
         * * * *
         * * *
         * *
         *
         */
        
        printpattern(5);
    }
    
}
