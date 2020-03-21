package Que8;

import java.sql.SQLOutput;
import java.util.Scanner;

class Ques8_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a string");
        String entry=sc.next();
        while(!entry.equals("done")){
            if(entry.charAt(0)==entry.charAt(entry.length()-1)){
                System.out.println("first and last char is same of word: "+entry);
            }
            else{
                System.out.println("first and last char is not same of word: "+entry);

            }
            entry=sc.next();
        }
    }
}

