//Check if a number is Armstrong

import java.util.Scanner;
public class Q08_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num=sc.nextInt();
        int original=num, sum=0;
        int digits=String.valueOf(num).length();

        while(num!=0) {
            int digit=num%10;
            sum += Math.pow(digit, digits);
            num/=10;
        }
        if(sum==original)
        System.out.println(original+" is an Armstrong Number");
        else
        System.out.println(original+" is NOT aan Armstrong Number");;
    }
}