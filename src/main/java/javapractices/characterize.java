package javapractices;

public class characterize {
    public static void main(String[] args) {
        String ss="Anima";
        int count=0;

        for (int i=0;i<ss.length();i++) {
            if (ss.charAt(i)!= '0') ;
            count++;
        }
        System.out.println("The total no of character in the string is:" +count);
        }
    }

