package javapractices;

public class Palindrome {
    public static void main(String[] args) {
        String s = "GADAG";
        String rev = " ";
        int strlength=s.length();
        for (int i = (strlength-1); i >= 0; --i) {
            String res = rev + s.charAt(i);
            if (s.equals(res)) {
                System.out.println(s + "is a Palindrome");
            }
            else {
                System.out.println(s + "is not a Palindrome");
            }
        }
    }
}
