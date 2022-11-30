package arraylistprgms;

import java.util.ArrayList;

public class AccessArryList {
    public static void main(String[] args) {
        //create an arrylist
        ArrayList<String> arr=new ArrayList<>();

        //add an element
        arr.add(0,"Ani");
        arr.add(1,"Ammu");
        arr.add(2,"Appi");
        arr.add(3,"Prithu");
        arr.add(4,"chinni");

        //get an arrylist
        System.out.print(arr.get(4));
    }
}
