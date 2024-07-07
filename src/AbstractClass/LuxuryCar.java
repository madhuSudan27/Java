package AbstractClass;

public abstract class LuxuryCar extends  Car{

    LuxuryCar(int mileage){
        super(mileage);
    }

    public abstract void pressDualBreak();

    // let's implement one of the method just to learn
    public  void pressBreak(){
        System.out.println("Break pressed");
        System.out.println("Automatically dual break is pressed");
        pressDualBreak();
    }
}
