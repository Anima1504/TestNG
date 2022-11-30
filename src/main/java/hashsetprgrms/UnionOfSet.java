package hashsetprgrms;

import java.util.HashSet;

public class UnionOfSet {
    public static void main(String[] args) {
        HashSet<Integer> evennumber=new HashSet<>();
        //add an element
        evennumber.add(2);
        evennumber.add(4);
        evennumber.add(6);
        evennumber.add(8);
        System.out.println("Evennumbers: "+ evennumber);
        //add a numbers
        HashSet<Integer> numbers=new HashSet<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);

     // union of 2 set
        numbers.addAll(evennumber);
        System.out.println("union of 2 sets: " + numbers);

    }
}
