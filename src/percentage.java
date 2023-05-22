import jdk.jfr.Percentage;

import java.util.*;

public class percentage {
    public static void main(String args[]){

        System.out.println("enter your marks for english: ");
        Scanner obj1 = new Scanner(System.in);
        int english = obj1.nextInt();

        System.out.println("enter your marks for maths: ");
        int maths = obj1.nextInt();
        System.out.println("enter your marks for computer: ");
        int computer = obj1.nextInt();
        int total = english + maths + computer;
        System.out.println("Total marks are 100\nPercentage is given...");
        System.out.println("Percentage = " +((float)(total*100)/300)+"%");
    }
}
