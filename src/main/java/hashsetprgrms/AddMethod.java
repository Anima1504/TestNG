package hashsetprgrms;

import java.util.HashSet;

public class AddMethod {
    public static void main(String[] args) {
        HashSet<Integer> evennumber=new HashSet<>();
        //add an element
        evennumber.add(2);
        evennumber.add(4);
        evennumber.add(6);
        evennumber.add(8);
        System.out.println("Evennumbers: "+ evennumber);

        HashSet<Integer> number=new HashSet<>();
        number.addAll(evennumber);
        number.add(5);
        System.out.println("numbers: " +number );

    }
}
