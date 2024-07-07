package NestedClass.InnerClass;


import AbstractClass.Car;

abstract class Car1{

    public abstract void pressBreak();
}




public class AnonymousInnerClass {
    // An inner class without a name is called Anonymous inner class
    // when to use
    // When we want to override the behaviour of the method without creating a class

    public static void main(String[] args) {

        Car1 audiCar = new Car1(){

            @Override
            public void pressBreak() {
                System.out.println("Break pressed through Anonymous class");
            }
        };
        audiCar.pressBreak();

    }
}
