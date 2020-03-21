package Que8;

import java.util.Scanner;

public class Ques8_1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter some words to check");
        String word=sc.next();

        do{
            char ch1=word.charAt(0);
            char ch2=word.charAt(word.length()-1);
            if(ch1==ch2){
                System.out.println("The first character and last character is same of the word " +word);
            }
            else {
                System.out.println("The first character and last character is not same of the word : " + word);
            }
            word=sc.next();
        }

        while(!word.equals("done"));

    }
}

