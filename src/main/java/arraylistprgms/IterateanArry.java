package arraylistprgms;

import java.util.ArrayList;

public class IterateanArry {
    public static void main(String[] args) {
        ArrayList<String> Animal = new ArrayList<>();

        Animal.add("Dog");
        Animal.add("Cat");
        Animal.add("Cow");
        Animal.add("Horse");
       System.out.print(Animal);

//        //using for loop
//        for (int i = 0; i < Animal.size(); i++) {
//            System.out.print(Animal.get(i));
//        }

        //for each loop
        for (String Anima : Animal) {
            System.out.print(Anima);
            System.out.print(", ");
        }
    }
}



