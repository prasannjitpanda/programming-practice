import java.util.Scanner;

public class CelsiusToFarenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        double farenheit = (celsius * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit: " + farenheit);
    }
}