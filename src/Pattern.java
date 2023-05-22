import java.util.*;

public class Pattern {
    public static void main(String args[]) {

        System.out.print("Enter a number: ");
        Scanner obj1 = new Scanner(System.in);
        int n = obj1.nextInt();
        /*
        ==> using for loop

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n-i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }


      ==>  using while loop
        int i = 1;
        while( i <= n){

            int j = 1;
            while(j<=n-i+1){
                System.out.print("*");
                j++;

            }
            System.out.println();
            i++;
        }

         */
    }
}
