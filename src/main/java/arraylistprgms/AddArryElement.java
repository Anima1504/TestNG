package arraylistprgms;

import java.util.ArrayList;

public class AddArryElement {
    public static void main(String[] args){
        //declare an arrylist
        ArrayList<String> Languages=new ArrayList<>();

        //add an element to arrylist
        Languages.add("Java");
        Languages.add("C++");
        Languages.add("Python");
        //add ruby to index 2
        Languages.add(2,"Ruby");
        System.out.print("ArryList: "+ Languages);
    }
}
