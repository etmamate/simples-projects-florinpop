import java.util.Scanner;

public class BinaryToDecimalInBuiltFunction {
    public static void main(String[] args) throws Exception {

        Scanner scn =  new Scanner(System.in);

        System.out.println("Enter the binary digit: ");

        String binaryDigit = scn.next();

        int decimalDigit = Integer.parseInt(binaryDigit, 2);

        System.out.println("Decimal of " + binaryDigit + " is: " + decimalDigit);
    }
}
