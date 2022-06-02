public class LargestNumber {
    public static void main(String[] args) {
        int arr[] = {10,50, 30, 95, 06, 70, 95, 95, 25, 84};
        int fLarge = 0, sLarge = 0;

        for (int i = 0; i < arr.length ; i++) {
            if (fLarge < arr[i]) {
                sLarge = fLarge;
                fLarge = arr[i];
            } else if (sLarge < arr[i] || fLarge == sLarge) {
                sLarge=arr[i];
            }
        }
        System.out.println("Largest Number --> " + fLarge);
        System.out.println("Second Largest Number --> " + sLarge);
    }
}
