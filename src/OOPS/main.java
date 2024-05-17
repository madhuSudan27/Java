package OOPS;

public class main {

    static class Dog {
        private
        String breed;
        int age;

        public
        void setData(String breed , int age){
            this.age = age;
            this.breed = breed;
        }

        void getData(){
            System.out.println("Dog breed is : "+ breed +" and age is: "+ age);
        }


    }
    public static void main(String[] args) {
        System.out.println("hello from main");
        Dog myDog = new Dog();
        myDog.setData("sitzzu", 9);
        myDog.getData();
    }
}
