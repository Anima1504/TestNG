package arraylistprgms;

import io.cucumber.core.cli.Main;

import java.util.ArrayList;

public class LengthOfArraylist {
    public static void main(String[] args) {
        ArrayList<String> Animal=new ArrayList<>();

        Animal.add("Dog");
        Animal.add("Cat");
        Animal.add("Cow");
        Animal.add("Horse");

        //get a length of an arraylist
        System.out.println(Animal.size());

    }
}
