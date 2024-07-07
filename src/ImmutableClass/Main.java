package ImmutableClass;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> sub = new ArrayList<>();
        sub.add("Math");
        sub.add("Science");
        sub.add("Englist");

        // obj

        MyImmutableClass obj = new MyImmutableClass("MadhuSudan", sub);
        System.out.println(obj.getSubjectsList());
        obj.getSubjectsList().add("Hindi");
        System.out.println(obj.getSubjectsList());

        /*
            - sub.add()  can modify the list
            -  so object values will be changed  not 100 %
            - solution make another list reference at the time of constructor call
         */
        sub.add("history");


        System.out.println(obj.getSubjectsList());

    }
}
