import java.util.Scanner;

public class Largest {

    public static void main(String[] args) {
        int maxNumber;
        Scanner input = new Scanner(System. in);
        System.out.println("Enter the 1st number: ");
        int n1 = input. nextInt();
        System.out.println("Enter the 2nd number: ");
        int n2 = input. nextInt();
        System.out.println("Enter the 3rd number: ");
        int n3 = input. nextInt();

        if( n1 >= n2 && n1 >= n3)
            maxNumber = n1;

        else if (n2 >= n1 && n2 >= n3)
            maxNumber = n2;

        else
            maxNumber = n3;

        System.out.println("The maximum of "+n1 +", " + n2+ ", "+n3+" is " + maxNumber+".");

        // Product pairing
        int maxProductPairing;
        int product1 = n1 * n2;
        int product2 = n1 * n3;
        int product3 = n3 * n2;

        if( product1 >= product2 && product1 >= product3)
            maxProductPairing = product1;

        else if (product2 >= product1 && product2 >= product3)
            maxProductPairing = product2;

        else
            maxProductPairing = product3;
        System.out.println("The maximum pairing product = " + maxProductPairing+".");
    }
}
