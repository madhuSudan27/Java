package NestedClass.InheritanceInNestedAndInnerClass;


class OuterClass{

    int instanceVariable = 10;
    static int classVariable = 100;

    class InnerClass1{
        int innerClass1 = 200;
        String name = "InnerClass1";
    }

    class InnerClass2 extends InnerClass1{
        int innerClass2 = 300;
        String name = "InnerClass2";

        void display(){
            System.out.println(instanceVariable + classVariable + innerClass1 + innerClass2 + " "+ name);
        }
    }

}


// with static
class OuterClass1{

    OuterClass1(){
        System.out.println("OuterClass Constructor");
    }

    static class NestedClass{

        NestedClass(){
            System.out.println("Nested Class constructor");
        }
        public void display(){
            System.out.println("From static inner class inside OuterClass1");
        }
    }
}

class SomeOtherClass extends OuterClass1.NestedClass{
    public void print(){
        display();
    }
}


// with none static

class OuterClass2{
    OuterClass2(){
        System.out.println("Outer class constructor");
    }

    class InnerClass{

        InnerClass(){
            System.out.println("Inner class constructor ");
        }
        public  void display(){
            System.out.println("Inside innerClass");
        }

    }
}

class HelperClass extends OuterClass2.InnerClass{

    HelperClass(){
        new OuterClass2().super();
        // as we know when child class constructor invoked it first invokes the parent class constructor
        // but here the parent is InnerClass which can only be accessed by object of OuterClass
    }

    public void print(){
        display();
    }


}



public class Main {
    public static void main(String[] args) {

//        OuterClass outerObject  = new OuterClass();
//
//        OuterClass.InnerClass1 innerObject0 = outerObject.new InnerClass1();
//        System.out.println(innerObject0.name);
//
//        OuterClass.InnerClass2 innerObject1 = outerObject.new InnerClass2();
//
//        innerObject1.display();

        SomeOtherClass otherObject = new SomeOtherClass();
        otherObject.print();


//        HelperClass helperObject = new HelperClass();
//        helperObject.print();




    }
}
