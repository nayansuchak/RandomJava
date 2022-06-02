import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practise {
    public static void main (String args[]) {
        System.out.println("Enter String to reverse : ");
        Scanner in = new Scanner(System.in);
        StringBuilder iSb = new StringBuilder(in.nextLine());
        StringBuilder oSb = new StringBuilder();
//        oSb.append(iSb);
//        oSb.reverse();
        for (int i = iSb.length(); i>0;i--) {
            oSb.append(iSb.substring(i-1,i));
        }
        System.out.println(oSb);
    }
}
