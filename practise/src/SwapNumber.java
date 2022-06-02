import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        System.out.println("Enter x and y\n");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println("Before Swapping" + num1 + num2);
        // Using third variable
/*
        int temp = num1;
        num1 = num2;
        num2 = temp;
*/
        // Without third variable
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("Before Swapping" + num1 + num2);
    }
}
