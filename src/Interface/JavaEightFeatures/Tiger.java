package Interface.JavaEightFeatures;

public class Tiger implements Animal{

    public void healthChec(){
        if(Animal.canEat()){
            System.out.println("Tiger can Eat");
        }
    }
}
