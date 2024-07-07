package SingletonClass;

public class DataBaseConnection {


    private DataBaseConnection(){

    }

    // Nested class
    private static class DataBaseConnectionHelper{
        private static final DataBaseConnection INSTANCE_OBJECT = new DataBaseConnection();
    }

    public static DataBaseConnection getInstance(){
        return DataBaseConnectionHelper.INSTANCE_OBJECT;
    }
}
