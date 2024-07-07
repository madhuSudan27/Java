package Enum;


public class Main {

    // Common function which is used in enum

    /*
    - values()
    - ordinal()
    - valueOf()
    - name()

     */
    public static void main(String[] args) {
        for(EnumSample sample : EnumSample.values()){

            // default value os known as ordinal()

            System.out.println(sample.ordinal());
        }


        EnumSample enumObject = EnumSample.valueOf("FRIDAY");
        System.out.println(enumObject.name());
        System.out.println(enumObject.ordinal());

        EnumWithCustomValue sampleVar = EnumWithCustomValue.getEnumFromValue(103);
        System.out.println(sampleVar.getComment());


        //EnumOverriding

        EnumOverriding mondayObj = EnumOverriding.MONDAY;
        mondayObj.enumMethod();

        EnumOverriding tuesdayObj = EnumOverriding.TUESDAY;
        tuesdayObj.enumMethod();





    }





}
