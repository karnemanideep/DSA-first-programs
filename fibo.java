import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int first = 0;
        int second = 1;
        System.out.println("Fibonacci Series up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.println(first + "  ");
            int third = first + second;
            first = second;
            second = third;
        }
    }
}