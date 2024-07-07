package NestedClass.InnerClass;


class OuterClass1{
    int instanceVariable = 10;
    static int staticInstanceVariable = 20;

    public void display(){
        int methodLocalVariable = 100;

        class LocalInnerClass{
            public void print(){
                System.out.println(instanceVariable + " "+ staticInstanceVariable + " "+ methodLocalVariable);
            }
        }

        // need to create an object

        LocalInnerClass localInnerObject = new LocalInnerClass();
        localInnerObject.print();
    }
}

public class LocalInnerClass {
    public static void main(String[] args) {

        OuterClass1 outerObject = new OuterClass1();
        outerObject.display();

    }
}
