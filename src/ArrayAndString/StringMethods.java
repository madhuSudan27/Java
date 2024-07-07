package ArrayAndString;

public class StringMethods {
    public static void main(String[] args) {
        String name = "anand";
        String name2 = "Anand";
        String firstName = "Madhusudan";
        String lastName = "Anand";
//        if(name > name2) then it will return greater than 0
//        if(name < name2 ) then it will return less than 0
//        if equal then it will return 0
        System.out.println(name.compareTo(name2));
        System.out.println(name.compareToIgnoreCase(name2));

        // concat

        String newName = firstName.concat(lastName);
        System.out.println(newName);

        // contains() <- weather a string contains sequence of character ( boolean )

        // equals
        // equalsIgnoreCase

        System.out.println(name.equalsIgnoreCase(name2));

//        toLowerCase
//        toUpperCase
//        split(" ")
//        substring(startIndex, endIndex)

    }
}
