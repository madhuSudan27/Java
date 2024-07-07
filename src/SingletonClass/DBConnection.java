package SingletonClass;

public class DBConnection {
    /*
     Eager initialization
     Eagerly initializing
     */

    private static DBConnection conObj = new DBConnection();

    private  DBConnection(){

    }

    public static DBConnection getInstance(){
        return conObj;
    }
}
