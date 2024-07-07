package Interface;

public interface Bird {
    // interface could be public or default
    /*
        - All methods are implicit public only
        - methods could not be final
        - fields are public static final implicitly

        - ** Abstract class are not forced to implement(Override) all methods (my implement or not)
        - concrete class have to provide all the implementation of method
     */

    public void fly(); // a Signature
}
