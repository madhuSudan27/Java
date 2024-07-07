package GenericClass;

public class GenericPrint <T> {

    T value;

    public T getValue(){
        return value;
    }

    public void setValue(T value){
        this.value = value;
    }
}
