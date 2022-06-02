import java.util.HashMap;
import java.util.Scanner;

public class DuplicateChars {
    public static void main(String[] args) {
        System.out.println("Please enter String to check duploicate : ");
        Scanner in = new Scanner(System.in);
        char str[] = in.nextLine().toCharArray();
        char temp[] = {};
        for (int i = 0; i < str.length; i++) {
            for (int j = i+1; j < str.length; j++) {
                if (str[i] == str[j] ) {
                    System.out.println("duplicate char --> " + str[j]);
                    break;
                }
            }
        }
    }
}
