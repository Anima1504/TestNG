package arraylistprgms;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ChangeArryList {
    public static void main(String[] args) {
        ArrayList<String> Languages=new ArrayList<>();

        Languages.add("C++");
        Languages.add("Java");
        Languages.add("Python");

        //Change the element
        Languages.set(2,"Ruby");
        System.out.print(Languages);
    }
}
