public class Sum {
    public static void main(String[] args) {
        int sumOfMultiple = 0;
        for(int i = 2; i <= 100; i++) {
            sumOfMultiple = sumOfMultiple + (i * (i+2));
        }
        System.out.println("Result of Summation : " + sumOfMultiple);

        /// using While loop
        int sumOfMulUsingWhile = 0;
        int i = 2;
        while( i <= 100) {
            sumOfMulUsingWhile = sumOfMulUsingWhile + (i * (i+2));
            i++;
        }
        System.out.println("Result of Summation using While loop: " +sumOfMulUsingWhile);

        // part ii - every while loop can be replaced by do loop
        int sumOfMulUsingDoWhile = 0;
        int x = 2;
        do {
            sumOfMulUsingDoWhile = sumOfMulUsingDoWhile + (x * (x+2));
            x++;
        } while (x <= 100);
        System.out.println("Result of Summation using Do-While loop: " +sumOfMulUsingDoWhile);

    }

}
