package Enum;

public enum EnumWithCustomValue {



    MONDAY(101,"1'nd day of the week"),
    TUESDAY(103, "2'rd day of the week"),
    WEDNESDAY(104, "3'th day of the week"),
    THURSDAY(105, "4'th day of the week"),
    FRIDAY(106, "5'th day of the week"),
    SATURDAY(107 , "it's 1st weekOff"),
    SUNDAY(108,"it's 2nd weekOff ");

    private int val;
    private String comment;

    EnumWithCustomValue(int val, String comment){
        this.val = val;
        this.comment = comment;
    }

    public  int getVal(){
        return val;
    }
    public String getComment(){
        return  comment;
    }

    public static EnumWithCustomValue getEnumFromValue(int val) {
        for(EnumWithCustomValue sample : EnumWithCustomValue.values()){
            if(sample.getVal() == val){
                return sample;
            }
        }
        return null;
    }
}
