package arraylistprgms;

import java.util.ArrayList;

public class RemoveArrayList {
    public static void main(String[] args) {
        ArrayList<String> Animal=new ArrayList<>();

        Animal.add("Dog");
        Animal.add("Cat");
        Animal.add("Cow");
        Animal.add("Horse");
        System.out.println("Animals: "+Animal);

      //Remove particular Animal name
       Animal.remove(1);
      System.out.println("Particular Animal: "+Animal);

        //remove all
        Animal.removeAll(Animal);
        System.out.println("Remove all: "+Animal);

        //Clear is the best method instead of removeAll
        Animal.clear();
        System.out.print("Clear: "+Animal);
    }
}
