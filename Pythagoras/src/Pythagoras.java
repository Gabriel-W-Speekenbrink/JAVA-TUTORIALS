package src;
import java.util.Scanner;

public class Pythagoras {
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);

        System.out.println("Please enter your first side: ");
        int sidea = kb.nextInt();

        System.out.println("Please enter your second side: ");
        int sideb = kb.nextInt();

        int sidec = (sidea * sidea) + (sideb * sideb);

        System.out.println("Your hypotenuse is equal to " + sidec);

        kb.close();
    }
}
