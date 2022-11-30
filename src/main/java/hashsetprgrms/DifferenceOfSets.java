package hashsetprgrms;

import java.util.HashSet;

public class DifferenceOfSets {
    public static void main(String[] args) {
        HashSet<Integer> primrnumbers=new HashSet<>();
        primrnumbers.add(2);
        primrnumbers.add(3);
        primrnumbers.add(5);
        System.out.println("HashSet1: "+ primrnumbers);

        //create an numbers
        HashSet<Integer>oddnumbers=new HashSet<>();
        oddnumbers.add(1);
        oddnumbers.add(3);
        oddnumbers.add(5);
        System.out.println("HashSet2: "+ oddnumbers);

        //Difference between the Hashset1 and hashset2
        primrnumbers.removeAll(oddnumbers);
        System.out.println("DiffernceOfSet: " +primrnumbers);
    }
}