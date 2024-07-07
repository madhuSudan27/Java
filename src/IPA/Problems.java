package IPA;

import java.util.Scanner;
public class Problems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ext input");
        String input = sc.nextLine();

        Problems p = new Problems();

        int count = p.countLowerCase(input);
        if(count == 0){
            System.out.println("No Lower case letter is present");
        }
        else{
            System.out.println(count);
        }
    }

    public int countLowerCase(String str){
        int res = 0;
        for(int index = 0; index < str.length(); index ++){
            char c = str.charAt(index);
            if(c >= 'a' && c <= 'z'){
                res ++;
            }

        }
        return res;
    }
}
