package patterns;

public class pattern5 {

    static void printpattern(int n)
    {
        int maxcol = n;
        for (int row = 0; row < 2*n-1; row++) 
        {
            if(row<n)
            {
             for (int col = 0; col <= row; col++) 
                {
                 System.out.print("* "); 
                }
            }
            if(row>=n)
            {
             for (int col = 0; col <maxcol-1; col++) 
                {
                 System.out.print("* "); 
                }
                maxcol--;
            }
            System.out.println();
           }
        }
    
    public static void main(String[] args) {
        /*
          * 
          * *
          * * *
          * *
          *
         */
        printpattern(3);
    }
}
