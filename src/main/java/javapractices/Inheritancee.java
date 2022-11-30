package javapractices;

public class Inheritancee {
    void eat(){
        System.out.println("eat");
    }
}
class dog extends Inheritancee{
    void bark(){
        System.out.println("barking");
    }
    static class Testinheritance{
        public static void main(String[] args){
            dog d=new dog();
            d.eat();
            d.bark();
        }
    }
}
