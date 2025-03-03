import java.util.Scanner;
public class CtoFTableDisplay {

    // Method to convert Celsius to Fahrenheit
    public static double CtoF(double Celsius) {
        return (Celsius * 1.8) + 32;
    }

    public static void main(String[] args) {
        System.out.println("Celsius \t Fahrenheit");
        System.out.println("-----------------------");

        for (int i = -100; i <= 100; i++) { // Step by 5 for readability
            double fahrenheit = CtoF(i);
            System.out.printf("%-10d %10.1f\n", i, fahrenheit);
        }
    }
}

