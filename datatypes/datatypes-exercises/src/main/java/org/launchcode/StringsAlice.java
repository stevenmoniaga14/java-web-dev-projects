package org.launchcode;

import java.util.Locale;
import java.util.Scanner;

public class StringsAlice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    String storedSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, ‘and what is the use of a book,’ " +
            "thought Alice ‘without pictures or conversation?’";

    System.out.println("Guess a word in the stored sentence");
    String searchTerm = input.nextLine();

    String lowerCaseSentence = storedSentence.toLowerCase();
    String lowerCaseSearch = searchTerm.toLowerCase();

    if (lowerCaseSentence.contains(lowerCaseSearch)) {
        System.out.println("true");

//        Finding the index and length
        int index = lowerCaseSentence.indexOf(lowerCaseSearch);
        int length = searchTerm.length();

        System.out.println("Your search term appears at index " + index + " and the length is " + length + " characters long");

//        Removal of the searched word and updating the sentence
        String updatedSentence = storedSentence.replace(searchTerm, "");
        System.out.println("Updated sentence is: " + updatedSentence);


    } else {
        System.out.println("false");
    }

    }
}