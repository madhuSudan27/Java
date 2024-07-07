package AbstractClass;

public class Audi extends LuxuryCar{

    Audi(int mileage){
        // super constructor
        super(mileage);
    }
    // now this will have all the implementation of the abstract class

    public void pressClutch(){
        System.out.println("Clutch pressed ...........");
    }

    @Override
    public void pressDualBreak() {
        System.out.println("Dual break pressed");
    }

    public static void main(String[] args) {

        Audi myCar = new Audi(12);
        System.out.println(myCar.getNumberOfWheel());
        myCar.pressBreak();
        myCar.pressClutch();
        myCar.pressDualBreak();

        // now let's create the reference of other object

        System.out.println("\n My car ");
        LuxuryCar myNewCar = new Audi(10);
        myNewCar.pressBreak();
        myNewCar.pressClutch();
        System.out.println(myNewCar.getNumberOfWheel());
    }
}


