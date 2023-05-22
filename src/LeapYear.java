import java.util.*;
public class LeapYear {
    public static void main(String args[]){
        Scanner obj1 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int user = obj1.nextInt();
        if(user % 4 == 0){
            System.out.println("year is leap");
        }
        else{
            System.out.println("year is not leap");

        }
    }
}
