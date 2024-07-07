package Interface.JavaEightFeatures;

public interface Bird  extends LivingThings{
    public void fly();
    /*
        why introduced getMinimumFlyHeight in java 8
        - enhancement in interface why ?
     */
    // no need to implement default method in all the child class



    /*
        - if we are overriding then implicitly we have to implement in the class
        - although the parent interface has same method implementation as default

     */
    boolean canBreathe();

    default boolean consumesEnergy(){

        // we can use the super interface or add oun implementation
        boolean canBreatheorNot = LivingThings.super.canBreathe();

        // own logic we can implement and return

        return canBreatheorNot;
    }

    default int getMinimumFlyHeight(){
        return 100;
    }
}
