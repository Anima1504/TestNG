package arraylistprgms;

import java.util.ArrayList;
import java.util.Iterator;

public class Hasnextmethod {
    public static void main(String[] args) {
    //declare an arrylist
    ArrayList<String> Languages=new ArrayList<>();

    //add an element to arrylist
        Languages.add("Java");
        Languages.add("C++");
        Languages.add("Python");

        //Create a variable of an itterator
        //store the iterarator returned by iterator()
        Iterator<String> i1=Languages.iterator();
        System.out.print(Languages);

        //use methods of iterator
        if(i1.hasNext()){
            System.out.print(i1.next());
            System.out.print(", ");
        }
}
}

