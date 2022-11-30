package javapractices;

public class SwappingNumber {
    public static void main(String[] args){
        int num1=10,num2=20;
        System.out.println("Before swapping");
        System.out.println("Before swapping num1: "+num1);
        System.out.println("Before swapping num2: "+num2);
//
//        //value of num1 is assigned to temporary
//        int temporary= num1;
//        //value of num2 is assigned to num1
//        num1=num2;
//        num2=temporary;

        //Another method
        num1 =num1-num2;//-10
        num2=num1+num2;//10
        num1=num2-num1;//20

        System.out.println("After swapping");
        System.out.println("After swapping num1: "+num1);
        System.out.println("After swapping num2: "+num2);

    }
}


