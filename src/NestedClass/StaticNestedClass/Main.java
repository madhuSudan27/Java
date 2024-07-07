package NestedClass.StaticNestedClass;



class OuterClass{
    int instanceVariable = 10;
    static int staticVariable = 20;


//    static class NestedClass{
//
//        void display(){
//            System.out.println("Outer static variable :-" + staticVariable );
//        }
//
//    }



    private static class NestedClass{
        //  private, access is restricted to OuterClass only
        void display(){
            System.out.println("Outer static variable :-" + staticVariable );
        }

    }

    public void createNestedInstance() {
        // Creating an instance of the static nested class

        NestedClass nested = new NestedClass();
        nested.display();
    }

}


public class Main {

    public static void main(String[] args) {

//        OuterClass.NestedClass nestedObject = new OuterClass.NestedClass();
//        nestedObject.display();

        OuterClass outerObject = new OuterClass();
        outerObject.createNestedInstance();
    }



}
