// The code here can be copy-pasted.
class P {
    private int pos;
    private int val;
    public int getPos() { return pos; }
    public int getVal() { return val; }
    public P(int ppos, int vval) { pos=ppos; val=vval; }
    public String toString() { return "["+pos+","+val+"]"; }
}

class Q {
    // you can modify this main method in anyway to suit your own approach
    public static void main(String[] args) {
        // M=array size, N=largest random number,
        // W=window size
        final int M=10, N=52, W=3;

        // declare the array and initialise it with required random values
        P[] p = new P[]{
                new P(0, 13),
                new P(1, 15),
                new P(2, 20),
                new P(3, 45),
                new P(4, 12),
                new P(5, 23),
                new P(6, 1),
                new P(7, 7),
                new P(8, 32),
                new P(9, 38)
        };

        // find which legitimate pair of P objects will lead to the maximum sum,
        // and then display your results,
        // including all the P objects you have created and stored in the array
        int result = sumOfTowLargestElements(p);
        for (P element:p) {
            System.out.println(element.getPos() + "==> " + element.getVal());
        }
        System.out.println("Sum of largest element is " + result);
    }

    public static int sumOfTowLargestElements(P[] elements) {
        int max = 52;
        int secondMax = 0;
        for (P element: elements) {
            if (element.getVal() > max) {
                secondMax = max;
                max = element.getVal();
            }
             else if(element.getVal() > secondMax && element.getVal()< max){
                 secondMax = element.getVal();
            }
        }
        System.out.println("The large Element is " + max);
        System.out.println("The Second largest element is " + secondMax);
        int sum = max + secondMax;
        return sum;
    }

}