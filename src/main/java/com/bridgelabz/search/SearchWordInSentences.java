package com.bridgelabz.search;

import java.util.Scanner;

public class SearchWordInSentences
{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter number of string");
        int noOfString=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter "+noOfString+" Sentence");
        String[] sentences=new String[noOfString];
        System.out.println("Enter the sentences:");
        for (int i = 0; i < noOfString; i++) {
            sentences[i] = scanner.nextLine();
        }
        System.out.println("Enter word to be search");
        String word=scanner.next();

        String sentence=searchSentence(sentences,word);
        System.out.println(sentence);
    }

    private static String searchSentence(String[] sentences, String word)
    {
        for(String sentence:sentences)
        {
            if(sentence.toLowerCase().contains(word.toLowerCase()))
            {
                return sentence;
            }
        }
        return "Not Found";
    }
}
