package NestedClass.InnerClass;

public class OuterClass {
    // member inner class
    // it can be private , public , protected, default

    int instanceVariable = 10;
    static int staticInstanceVariable = 20;
    class InnerClass{

        public void print(){
            System.out.println("Outer class Variables are :- "+ instanceVariable + " "+ staticInstanceVariable);
        }

    }

    public static void main(String[] args){

        OuterClass outerObject = new OuterClass();

        // Inner class object
        OuterClass.InnerClass innerClassObject = outerObject.new InnerClass();

        innerClassObject.print();
    }

}
