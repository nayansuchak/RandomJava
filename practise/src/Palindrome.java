import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String original = "";
        System.out.println("Please enter String to check : ");
        Scanner in = new Scanner(System.in);
        original = in.nextLine();
        StringBuilder reversedString = new StringBuilder(original);
        reversedString.reverse();
        if (original.equals(reversedString.toString())) {
            System.out.println("This string is palindrome");
        } else {
            System.out.println("This string is NOT palindrome");
        }

    }
}
