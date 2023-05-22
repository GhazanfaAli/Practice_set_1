import java.util.*;
public class convert_UPPER_to_LOWER_VICEVERSA {
    public static void main(String args[]){
        System.out.println("enter the word ");
        Scanner obj1 = new Scanner(System.in);
        String word1 = obj1.next();
        System.out.println("PRESS THE U for UPPER CASE and for LOWER L: ");
        Scanner obj2 = new Scanner(System.in);
        char op = obj2.next().charAt(0);

        if(op == 'U'){
            String word2 = word1.toUpperCase();

            System.out.println(word2);
        }
        else if(op == 'L'){
            String word3 = word1.toLowerCase();
            System.out.println(word3);
        }

    }
}
