package patterns;

public class pattern6 {
    static void printpattern(int n)
    {
        int nfs = n-1;// nfs=no of spaces
        int bnfs=n;
        int maxcol=n;
           for (int row = 0; row <=2*n-1; row++)
            {
                if(row<n)
                    {
                    for(int space =0;space<=nfs;space++)
                        {
                         System.out.print(" ");   
                        }
                        nfs--;
                    for (int col = 0; col < row; col++) 
                         {
                         System.out.print(" *");
                        }
                    }
                
                if(row>=n)
                {
                    for(int space =0;space<n-bnfs;space++)
                         {
                          System.out.print(" ");  
                         }
                         bnfs--;
                    for (int col = 0; col < maxcol; col++) 
                        {
                        System.out.print(" *");   
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
  * * * *
 * * * * *
  * * * *
   * * *
    * *
     *
     * */
        printpattern(5);
    }
}
