package Hashmap;

import io.cucumber.java.sl.In;

import java.util.HashMap;

public class Getelements {
    public static void main(String[] args) {
            HashMap<Integer,String> langs = new HashMap<>();

            //add elements
           langs.put(1,"java");
           langs.put(2,"C++");
           langs.put(3,"Python");
           System.out.println("Langs: "+ langs);

           String lang=langs.get(3);
           System.out.println("Languages: "+ lang);

           //to get an keyvalue
        System.out.println("Keyset:"+langs.keySet());
        //to get an Value
        System.out.println("Values: "+langs.values());
        //to get an setview
        System.out.println("Setview: "+langs.entrySet());

    }
}
