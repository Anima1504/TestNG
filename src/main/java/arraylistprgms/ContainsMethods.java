package arraylistprgms;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ContainsMethods {
    public static void main(String[] args) {
        ArrayList<Integer> intt=new ArrayList<>();

        intt.add(0);
        intt.add(1);
        intt.add(2);
        intt.add(3);
        System.out.println(intt);

        //check the index is present
        System.out.println(intt.contains(4));
    }
}
