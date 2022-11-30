package hashsetprgrms;

import java.util.HashSet;

public class RemoveElement {
    public static void main(String[] args) {
        HashSet<Integer> evennumber = new HashSet<>();
        //add an element
        evennumber.add(2);
        evennumber.add(4);
        evennumber.add(6);
        evennumber.add(8);
        System.out.println("Evennumbers: " + evennumber);

        //remove the elements
        boolean value = evennumber.remove(2);
        System.out.println("is 2 is removed: " + value);
        System.out.println("Evennumbers: " + evennumber);
        // remove all the elements
        boolean value1 = evennumber.removeAll(evennumber);
        System.out.println("is all the element is removed:"+value1);
        System.out.println("is all the element is removed:"+evennumber);

    }
}
