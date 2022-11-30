package hashsetprgrms;

import java.util.HashSet;



public class Subset {
    public static void main(String[]args){
    //create an numbers
    HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println("HashSet2: "+numbers);

        HashSet<Integer> primenumbers=new HashSet<>();
        primenumbers.add(2);
        primenumbers.add(2);
        primenumbers.add(3);
        System.out.println("HashSet1: "+ primenumbers);

        //Check the primenumber is subset of numbers
        boolean value=numbers.containsAll(primenumbers);
        System.out.println("Subset:" +primenumbers);
}
}
