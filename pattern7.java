package patterns;

public class pattern7 {
    
    static void printpattern(int n)
    {
        for (int row = 0; row < n; row++) {
            // space
            for(int space = 0;space<=n-row;space++)
            {
                System.out.print(" ");
            }
            //star
            for(int star=0;star<=row;star++)
            {
              System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        /*  
      *
     **
    ***
   ****
  *****
  */
        printpattern(5);
    }
}
