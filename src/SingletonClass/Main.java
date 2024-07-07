package SingletonClass;

public class Main {
    public static void main(String[] args) {

        DBConnection obj =DBConnection.getInstance();
        System.out.println(obj);
    }
}
