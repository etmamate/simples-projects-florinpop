import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the Binary digit: ");

        String binaryDigit = scn.next();

        int temp = Integer.parseInt(binaryDigit); // Converting String -> Integer

        int power = 0;

        int decimalNumber = 0;

        while (temp != 0) {
            int rem = temp % 10;
            decimalNumber = decimalNumber + (int) (rem * Math.pow(2, power));
            power++;
            temp = temp / 10;
        }

            System.out.println("The decimal digit of " + binaryDigit + " is " + decimalNumber);
    }
}
