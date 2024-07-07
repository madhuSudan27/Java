package Interface.JavaEightFeatures;

public interface Animal {
    /*

        - static method can not be overridden by classes
        - we can access it using interface name
     */
    static boolean canEat(){
        return true;
    }
}
