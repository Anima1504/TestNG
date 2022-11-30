package hashsetprgrms;

import java.util.HashSet;
import java.util.Iterator;

public class AccessElements {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        //add an element
        numbers.add(2);
        numbers.add(3);
        numbers.add(7);
        numbers.add(8);
        System.out.println("Evennumbers: " + numbers);

        //to get an elements
        Iterator<Integer> i1 = numbers.iterator();
        System.out.print("Hashset using iterator: ");

        //Accessing element
        while (i1.hasNext()) {
            System.out.print(i1.next());
            System.out.print(", ");
        }

    }
}