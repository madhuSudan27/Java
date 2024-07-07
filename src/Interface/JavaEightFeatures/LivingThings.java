package Interface.JavaEightFeatures;

public interface LivingThings {
    default boolean canBreathe(){
        return true;
    }

    default boolean consumesEnergy(){
        return true;
    }
}
