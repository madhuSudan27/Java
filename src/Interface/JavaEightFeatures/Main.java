package Interface.JavaEightFeatures;

public class Main {
    public static void main(String[] args) {

        Sparrow bird = new Sparrow();
        bird.fly();
        System.out.println( bird.getMinimumFlyHeight());
        System.out.println(bird.canBreathe());

        Tiger myTiger = new Tiger();
        myTiger.healthChec();

    }
}
