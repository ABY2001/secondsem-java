package javalab;

import java.util.Scanner;

public class vowels {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a line of text: ");
        String text = sc.nextLine();
        sc.close();
        
        text = text.toLowerCase();
        int vowels = 0, consonants = 0;
        char[] vowelArray = {'a', 'e', 'i', 'o', 'u'};

        for (int i = 0; i < text.length(); i++) { 
            char character = text.charAt(i);
            if (Character.isLetter(character)) { 
                boolean isVowel = false;
                for (int j = 0; j < vowelArray.length; j++) {  
                    if (character == vowelArray[j]) {  
                        isVowel = true;
                        break;
                    }
                }
                if (isVowel) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
    }

}
