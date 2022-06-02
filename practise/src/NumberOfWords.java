import java.util.HashMap;

public class NumberOfWords {
    public static void main(String[] args) {
        String str = "This this is is java java demo demo test";
        String[] split = str.split(" ");

        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        for (int i = 0; i<split.length; i++) {
            if (hashMap.containsKey(split[i])) {
                hashMap.put(split[i], hashMap.get(split[i]) + 1);
            } else {
                hashMap.put(split[i], 1);
            }
        }
        System.out.println(hashMap);
    }
}
