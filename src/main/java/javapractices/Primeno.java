package javapractices;

public class Primeno {

    public static void main(String[] args) {
        int n = 10;
        boolean flag = false;
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("is a prime no");
        } else {
            System.out.println("is not a prime no");
        }
    }
    }

