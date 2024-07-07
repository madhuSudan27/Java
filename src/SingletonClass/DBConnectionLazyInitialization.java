package SingletonClass;

public class DBConnectionLazyInitialization {

    private static DBConnectionLazyInitialization dbConnectionObj; //not initialized

    // restrict object creation
    private DBConnectionLazyInitialization(){

    }

    public static DBConnectionLazyInitialization getInstance(){
        if(dbConnectionObj == null){
            dbConnectionObj = new DBConnectionLazyInitialization();
        }
        return dbConnectionObj;
    }

    /*
        - But what if two threads are running in parallel and calls the
        - getInstance method at same time
        - will result in creation of two Object

     */
}
