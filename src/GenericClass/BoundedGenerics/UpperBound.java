package GenericClass.BoundedGenerics ;


class Print<T extends Number>{
    // here Number will work as upper bound
    // we can use all the child class of Number

    T value;

    public void setValue(T value) {
        this.value = value;
    }
    public T getValue(){
        return value;
    }
}

public class UpperBound {
    public static void main(String[] args) {
        Print<Integer> intObject = new Print<>();

//        Print<String> strObject = new Print<>(); // error

    }
}
