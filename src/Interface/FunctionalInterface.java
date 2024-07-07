package Interface;


public class FunctionalInterface {

     public static void main(String[] args) {


//        Anonymous class implementation
         // no need to implement the interface
        Vehicle mtMotorBike = new Vehicle() {
            @Override
            public boolean canRace() {
                return false;
            }
        };


        /*

            - Lambda expression
            - why we need lambda expression
                - we know that every functional interface has only one abstract method
                - then here is no need to overriding and writing more code
         */

         Vehicle myCar = ()->{
            return true;
         };



    }
}
