package javapractices;

public class SwappingString {

        public static void main(String[] args) {
            String s1="Anitha";
            String s2="Anima";

            System.out.println("Before swapping");
            System.out.println("Before swapping String1: "+s1);
            System.out.println("Before swapping String2: "+s2);

            int i = s1.length();
            s1 = s1+s2;
            s2 = s1.substring(0,i);
            s1 = s1.substring(i);

            System.out.println(s1.length());
            System.out.println("After swapping");
            System.out.println("After swapping String1: "+s1);
            System.out.println("After swapping String2: "+s2);
        }
        }



