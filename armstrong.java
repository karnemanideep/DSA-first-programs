import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the lower limit: ");
        int lower = input.nextInt();

        System.out.print("Enter the upper limit: ");
        int upper = input.nextInt();

        System.out.println("Armstrong numbers between " + lower + " and " + upper + " are:");

        for (int num = lower; num <= upper; num++) {
            if (isArmstrong(num)) {
                System.out.println(num);
            }
        }
    }

    public static boolean isArmstrong(int number) {
        int originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += remainder * remainder * remainder;
            originalNumber /= 10;
        }

        return result == number;
    }
}
