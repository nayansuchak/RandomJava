import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NavArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("Traditional for loop");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("For each loop");
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
