import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int month = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("In what month were you born? (Enter a number 1-12)");
        if (scan.hasNextInt())
            month = scan.nextInt();
        if (month == 1)
        {
            System.out.println("Your birth month is: January");
        }
        else if (month == 2)
        {
            System.out.println("Your birth month is: February");
        }
        else if (month == 3)
        {
            System.out.println("Your birth month is: March");
        }
        else if (month == 4)
        {
            System.out.println("Your birth month is: April");
        }
        else if (month == 5)
        {
            System.out.println("Your birth month is: May");
        }
        else if (month == 6)
        {
            System.out.println("Your birth month is: June");
        }
        else if (month == 7)
        {
            System.out.println("Your birth month is: July");
        }
        else if (month == 8)
        {
            System.out.println("Your birth month is: August");
        }
        else if (month == 9)
        {
            System.out.println("Your birth month is: September");
        }
        else if (month == 10)
        {
            System.out.println("Your birth month is: October");
        }
        else if (month == 11)
        {
            System.out.println("Your birth month is: November");
        }
        else if (month == 12) {
            System.out.println("Your birth month is: December");
        }
        else if (month > 12 || month < 0)
        {
            System.out.println("You entered an incorrect month value.");
        }
    }
}