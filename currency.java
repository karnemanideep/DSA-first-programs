import java.util.Scanner;

public class currency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input indian currency ");
        double num1 = input.nextDouble();
        double exchangerate=0.012;
        double usd = num1*exchangerate;
        System.out.println("The value is usd is " + usd);
    }
}
