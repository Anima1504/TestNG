package javapractices;

public class ReverseString {
    public static void main(String[] args)
    {
        String s = "Java";
        String rev = " ";
        for (int i = 3; i >= 0; i--) {
          String  res= rev+s.charAt(i);
            System.out.print(res);
        }
    }
}
