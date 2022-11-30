package Hashmap;

import java.util.HashMap;

public class Addmathod {
    public static void main(String[] args) {
        HashMap<String,Integer> lang1=new HashMap<>();

        //add elements
        lang1.put("Two",2);
        lang1.put("Three",3);
        System.out.println("Lang1:t "+ lang1);

        //add 2nd elements
        HashMap<String,Integer>lang2=new HashMap<>();
        lang2.put("One",1);
        lang2.put("Two",22);
        System.out.println("lang2: "+ lang2);

        //add all mapping from lang2 to lang1
        lang2.putAll(lang1);
        System.out.println("languages: "+ lang2);
    }
}
