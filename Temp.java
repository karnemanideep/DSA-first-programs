import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter tempetaure in c" );
        float tempc = input.nextFloat();
        float tempf = (tempc*9/5) +32;
        System.out.println(tempf);
    }
}
