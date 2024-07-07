package GenericClass;

public class Utility {

    public static <K,T> void printPair(Pair<K,T> pair){

        System.out.println("Key is :- "+ pair.getKey());
        System.out.println("Value is :- "+ pair.getValue());
    }

    public static <T> void printArray(T[] array){

        for(T ele: array){
            System.out.print(ele + " ");
        }
    }
}
