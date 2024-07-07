package Interface;

@java.lang.FunctionalInterface
public interface Vehicle {
    public boolean canRace();

    /*

        - Apart from one abstract method
        - we can have default and static method
     */

    default void controlAc(){

    }

    static void start(){

    }

    // Object methods are not abstract
    String toString();

}
