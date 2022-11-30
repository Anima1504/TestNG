package javapractices;

abstract class Animal {
    abstract void makeSound();

    public void eat() {
        System.out.println("I can eat");
    }
}
//Provide a implementation of abstract class
  class Dog extends Animal {
      public void makeSound() {
          System.out.println("I can sound");
      }
  }
  class Main{
    public static void main(String[] args){
        //Create an object of dog class
        Dog dg=new Dog();
        dg.eat();
        dg.makeSound();
    }
}
