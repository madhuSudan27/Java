package Interface;

public class Main {
    public static void main(String[] args) {
        /*
            - why we need interface
                - to achieve 100 % abstraction
                - Abstraction
                - polymorphism
                - Multiple inheritance

            - we can not create object of interface
            - we can create instance of Concrete class only

         */

        Bird birdObject1 = new Hen();
        Bird birdObject2 = new Eagle();

        // on run time it decides which fly method to call
        birdObject2.fly();
        birdObject1.fly();




    }
}
