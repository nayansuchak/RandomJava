import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapIteration {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(0,"I ");
        hashMap.put(1, "Love ");
        hashMap.put(2, "Java;");

        Iterator itr = hashMap.entrySet().iterator();
        System.out.println("**********While loop**************");
        while(itr.hasNext()) {
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println("Key is " + entry.getKey() + " value is : " + entry.getValue());
        }
        System.out.println("**********For loop**************");
        for (Map.Entry me : hashMap.entrySet()) {
            System.out.println("Key is " + me.getKey() + " value is : " + me.getValue());
        }
    }
}
