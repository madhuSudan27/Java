package GenericClass;

import static GenericClass.Utility.printArray;
import static GenericClass.Utility.printPair;

public class Main {
    public static void main(String[] args) {

//        Print printObject = new Print();
//        printObject.setValue(false);
//
//        System.out.println(printObject.getValue().getClass());

//        GenericPrint<Integer> obj1 = new GenericPrint<Integer>();
//        obj1.setValue(100);
//        System.out.println(obj1.getValue());
//
//        GenericPrint<Integer> obj2 = new GenericPrint<>();
//        obj2.setValue(20);
//        System.out.println(obj2.getValue());


        Pair<String, Integer> myAge = new Pair<>("Madhusudan" , 22);

        printPair(myAge);

        Integer[] array = {1,2,3,4,5,6,7};
        Integer[] arr = new Integer[10];

        printArray(array);
        printArray(arr); // null


//        internally it passes Object as parameterized type
        GenericPrint rowObj = new GenericPrint();
        rowObj.setValue(1);









    }
}
