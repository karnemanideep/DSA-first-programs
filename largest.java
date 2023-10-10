import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter first number");
        double num1 = input.nextDouble();
        System.out.println("Enter sexond number");
        double num2 = input.nextDouble();
        double largestnumber = 0;
        if (num1>num2){
            largestnumber=num1;
        } else if (num2>num1)
        {largestnumber=num2;
        }
        System.out.println("The largest number is " + largestnumber);

    }
}
