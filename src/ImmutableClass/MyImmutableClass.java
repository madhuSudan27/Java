package ImmutableClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

final class MyImmutableClass {

    /*
        In Java, declaring a class as final means that the class cannot be subclassed.
        This ensures that no other class can extend it, thereby preventing inheritance.
        The final keyword in this context is used to guarantee that the class's behavior
        remains unchanged and cannot be altered by subclassing.
     */

    // like a student class
    private final String name;
    private final List<Object> subjects;

    MyImmutableClass(String name , List<Object> subjects){
        this.name = name;
        this.subjects = new ArrayList<>(subjects);
    }
    public String getName(){
        return name;
    }
    public List<Object> getSubjectsList(){
        // making list final means we can not change the reference
        // but still the list is modifiable
        //  we need  to keep  it unchanged

        return new ArrayList<>(subjects);
    }

}
