package patterns;

public class pattern8 {

    static void printpattern(int n)
    {
        int nofstars=n;
        for(int row=0;row<=n;row++)
        {
            // space
            for(int space=0;space<row;space++)
            {
                System.out.print(" ");
            }
            // star
            for(int star=0;star<nofstars;star++)
            {
                System.out.print("*");
            }
            nofstars--;
            System.out.println();
        }
    }
    public static void main(String[] args) {
    /*
    *****
     ****
      ***
       **
        *
     */
        printpattern(5);
    }
}
