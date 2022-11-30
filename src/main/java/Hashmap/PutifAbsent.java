package Hashmap;

import java.util.HashMap;

public class PutifAbsent {
    public static void main(String[] args) {

        HashMap<Integer,String> langs = new HashMap<>();

        //add elements
        langs.put(1,"java");
        langs.put(2,"C++");
        langs.put(3,"Python");
        System.out.println("Langs: "+ langs);

        //Put if absent
        langs.putIfAbsent(3,"bcc");
        langs.putIfAbsent(4,"bcc");
        System.out.println("Lang1:"+ langs);

    }
}
