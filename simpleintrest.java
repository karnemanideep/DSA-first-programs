import java.util.Scanner;

public class simpleintrest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter prin amount");
        double prin = input.nextDouble();
        System.out.println("Enter rate amount");
        double rate = input.nextDouble();
        System.out.println("Enter time");
        double time = input.nextDouble();

        double intrest=(prin * rate * time) / 100;
        System.out.println("This is the intrest "+ intrest);

    }
}
