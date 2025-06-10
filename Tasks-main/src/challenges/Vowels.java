package challenges;

import java.util.Scanner;

public class Vowels {

    public static void main(String[] args) {
        System.out.println("Enter the string:");
        Scanner in = new Scanner(System.in);
        String letter = in.next(); 

        int vowel = 0, consonant = 0;

        for (int i = 0; i < letter.length(); i++) {
            char ch = Character.toLowerCase(letter.charAt(i)); 

            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowel++;
                } else {
                    consonant++;
                }
            }
        }

        System.out.println("Vowels: " + vowel);
        System.out.println("Consonants: " + consonant);

        in.close();
    }
}
