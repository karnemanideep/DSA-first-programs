import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (isPalindrome(number)) {
            System.out.println("It's a palindrome!");
        } else {
            System.out.println("It's not a palindrome.");
        }
    }

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }
}
