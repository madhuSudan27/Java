package SingletonClass;

public class DBConnectionDoubleCheckLock {

    /*
        - double check lock
        - thread safe for parallel method call
        - but have some issues

     */
    private static volatile DBConnectionDoubleCheckLock dbObject;
    /*

    - Solution for memory issue

    - making it volatile will give access to memory
    - it won't involve cache operation
     */

    private DBConnectionDoubleCheckLock(){
    }

    public static DBConnectionDoubleCheckLock getInstance(){

        // Double check lock thread safe
        if(dbObject == null){
            synchronized (DBConnectionDoubleCheckLock.class){
                if(dbObject == null){ // re check if already initialize no need to recreate again
                    dbObject = new DBConnectionDoubleCheckLock();
                }
            }
        }
        return dbObject;
    }


}
