package hashsetprgrms;

import java.util.HashSet;

public class Intersection {
    public static void main(String[] args) {
        HashSet<Integer>primrnumbers=new HashSet<>();
        primrnumbers.add(2);
        primrnumbers.add(3);
        System.out.println("primenumbers: "+ primrnumbers);

        //create an numbers
        HashSet<Integer>numbers=new HashSet<>();
        numbers.add(2);
        numbers.add(4);
        System.out.println("numbers: "+ numbers);

        //intersection of 2 sets
        numbers.retainAll(primrnumbers);
        System.out.println("intersection is: "+ numbers );

    }
}
