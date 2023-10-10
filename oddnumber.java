import java.util.Scanner;

public class oddnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int number = input.nextInt();
        if
            (number %2!=0){
            System.out.println("Given number is odd");
        }
        else {
            System.out.println("Given number is not odd");
        }
    }
}
