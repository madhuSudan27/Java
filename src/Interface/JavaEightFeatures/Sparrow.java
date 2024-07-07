package Interface.JavaEightFeatures;

public class Sparrow implements Bird{

    public void fly(){
        System.out.println("Sparrow flying ");
    }

    // in case if default we can override it
    @Override
    public boolean canBreathe() {
        return false;
    }
}
