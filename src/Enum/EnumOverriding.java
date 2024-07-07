package Enum;

public enum EnumOverriding {
    MONDAY{
        @Override
        public void enumMethod() {
//            super.enumMethod();
            System.out.println("monday method");
        }
    },
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public void enumMethod(){
        System.out.println("Its a commmon method");
    }
}
