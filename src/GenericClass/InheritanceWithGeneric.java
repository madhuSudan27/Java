package GenericClass;



class NonGeneric extends GenericPrint<String>{
    // in nonGeneric class we have to explicitly declare the parent class data type
}

class Generic<T> extends GenericPrint<T>{


}

public class InheritanceWithGeneric {
    public static void main(String[] args) {

        NonGeneric obj = new NonGeneric();
        obj.setValue("Madhu");
        System.out.println(obj.getValue());

        Generic<Integer> obj1 = new Generic<Integer>();
        obj1.setValue(20);
        System.out.println(obj1.getValue());



    }
}
