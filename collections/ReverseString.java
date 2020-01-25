package com.cts.collections;

public class ReverseString {
    public static void main(String[] args) {
        String sentence = "Akhil ";
        String r = reverse(sentence);
        System.out.println("The reversed sentence is: " + r);
    }
    public static String reverse(String sentence)
    {
        if (sentence.isEmpty())
            return sentence;
        return reverse(sentence.substring(1)) + sentence.charAt(0);
    }
}