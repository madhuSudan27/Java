package Interface;

public class Crocodile implements LandAnimal, WaterAnimal{

    /*
        - Diamond problem resolved
        - now Crocodile class can implement multiple interface
     */
    @Override
    public boolean canBreathe(){
        System.out.println("Crocodile breathing");
        return true;
    }

}
