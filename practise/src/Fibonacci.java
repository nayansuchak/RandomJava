import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 1;
        System.out.println("Please enter number of times : ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for (int i = 0; i < num; i++) {
            a = b;
            b = c;
            c = a+b;
            System.out.print(a + ", ");
        }
    }
}
