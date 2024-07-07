package SingletonClass;

public class DBConnectionSynchronized {
    private static DBConnectionSynchronized dbSynObject ;

    private DBConnectionSynchronized(){
    }

    synchronized public static DBConnectionSynchronized getInstance(){
       if(dbSynObject == null){
           dbSynObject = new DBConnectionSynchronized();
       }
       return dbSynObject;
    }

}
