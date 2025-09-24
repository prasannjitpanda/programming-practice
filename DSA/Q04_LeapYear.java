// Check Leap Year

import java.util.Scanner;

public class Q04_LeapYear {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year: ");
        int year = sc.nextInt();

        if((year %400 == 0) || (year %4 == 0 && year %100 != 0))
        System.out.println(year + "is a leap year");
        else
        System.out.println(year + "is NOT a leap year");
    }
}
