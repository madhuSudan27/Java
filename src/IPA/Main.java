package IPA;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input");
        String input= sc.nextLine();

        Main myObj = new Main();
        int count = myObj.countWordStartingWithVowel(input);
        System.out.println(count);

    }

    public int countWordStartingWithVowel(String str){
        int count = 0;
        String []words = str.split(" ");
        for(int i = 0; i < words.length ;i ++){
            char alphabet = words[i].charAt(0);
            if(isVowel(alphabet)){
                count ++;
            }

        }

        return count;

    }
    public boolean isVowel(char ch){
        char [] vowels ={'a','e','i','o','u','A','E','I','O','U'};
        for(char c: vowels){
            if(ch == c){
                return  true;
            }
        }
        return false;
    }
}
