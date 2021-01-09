package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello Java");
//        System.out.println("Hey");
//        System.out.println("Hi");
        Scanner output = new Scanner(System.in);  // wrong word

        // Getting user input for name
        System.out.println("What is your name?")  // need semicolon
        // slide 21
        String firstName= input.nextLine();
//        System.out.printf("Hello %s!\n", firstName);

        // Getting lastname from the user
        System.out.println("What is your last name?");
        String lastName = input.nextLine();
        System.out.printf("your name is %s, %s.\n",firstName, lastName);
        System.out.println(Enter a name);  // missing quotation
        String name = input.nextLine();
        System.out.println("Give me an adverb: ");
        String adverb = input.nextLine();
        System.out.println("Give me a adjective: ");
        String adjective = input.nextLine();
        System.out.println("Give me a verb: ");
        String verb = input.nextLine();
        System.out.println("Give me a noun two: ");
        String nounTwo = input.nextLine();
        System.out.println("Give me a number: ");
        String number = input.nextLine();
        System.out.println("Give me your name: ");
        String yourName = input.nextLine();
        System.out.printf("Here is your story: \n");
        System.out.printf("\n Dear %s,", name);
        System.out.printf("\n You are %s %s and I want to be your %s!", adverb, adjective, verb);
        System.out.printf("\n I want to go to the %s with you in %s days.", nounTwo, number);
        System.out.printf("\n Sincerely, %s \n", yourname);  // check capitalization
    }
}
