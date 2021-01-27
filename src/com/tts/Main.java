package com.tts;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + " Welcome to our site!");

        Scanner goOn = new Scanner(System.in);
        System.out.println("Would you like to continue?:");

        String newString = goOn.nextLine();

        if (newString.equals("yes")) {
            System.out.println("Great! Let's continue!");
        } else {
            System.out.println(name + " Please return later to complete the survey.");
        }
        System.out.println("Is your car red?: ");
        String nextString = scanner.nextLine();
        if (nextString.equals("yes")) {
            System.out.println("Nice! Red is a sexy color!");
        } else {
            System.out.println("That's probably good. Red cars are statistically pulled over more by cops.");
        }

        System.out.println("What is the name of your favorite pet?");
        String petString = scanner.nextLine();
        System.out.println(petString + ", Is a beautiful name!");

        System.out.println("How old is your favorite pet?");
        int ageString = scanner.nextInt();
        System.out.println(ageString + ", Is the perfect age!");

        System.out.println("What is your lucky number?");
        int luckyString = scanner.nextInt();
        System.out.println("You have entered: " + luckyString);

        System.out.print("Do you have a favorite quarterback?(yes, no)  : ");
        int jerseyNumber = scanner.nextInt();
        if (jerseyNumber.equals("yes")) {
            System.out.print("What is the jersey number : ");
            jerseyNumber = scanner.nextInt();
        }

        System.out.println("What is the two-digit model year of your car?");
        String carString = scanner.nextLine();
        System.out.println("You have entered: " + carString);

        System.out.println("Who is your favorite actor or actress?");
        String actString = scanner.nextLine();
        System.out.println("You have entered: " + actString);

        System.out.println("Enter a random number between 1 and 50:");
        String randomString = scanner.nextLine();
        System.out.println("You have entered: " + randomString);

        //Generating Output
        Random rand = new Random();
        int magicballNumber;

        int rand1 = rand.nextInt(50);
        int rand2 = rand.nextInt(50);
        int rand3 = rand.nextInt(50);
        if ((rand.nextInt(2) == 1) && (jerseyNumber = 0)) {
            // choose the jersey number else choose the lucky number
            magicballNumber = jerseyNumber * rand1;
        } else {
            magicballNumber = luckyString * rand1;
        }
        if (magicballNumber > 75) {
            // subtract 75 from it
            magicballNumber = magicballNumber - 75;
        }
        //    generate other 5 numbers
        int number1, number2, number3, number4, number5;
        // choosing the options =  model number + lucky number

        number1 = carString + luckyString;
        // checking if the numbers are in range
        if (number1 > 65)
            number1 = number1 - 65;
        if (number1 < 1)
            number1 = number1 + 65;
        // choosing the options =  random numbers between 1 and 50 and subtract rand2
        number2 = rand2 - rand.nextInt(50);
        // checking if the numbers are in range
        if (number2 > 65)
            number2 = number2 - 65;
        if (number2 < 1)
            number2 = number2 + 65;
        // choosing the options =  use a value 42
        number3 = 42;

        // choosing the options = age of the favorite pet + model year
        number4 = ageString + carString;
        // checking if the numbers are in range
        if (number4 > 65)
            number4 = number4 - 65;
        if (number4 < 1)
            number4 = number4 + 65;
        // choosing the options =  first letter of favorite actress
        number5 = (int) actString.charAt(0);
        // checking if the numbers are in range
        if (number5 > 65)
            number5 = number5 - 65;
        if (number5 < 1)
            number5 = number5 + 65;
        System.out.print("Lottery numbers : ");
        System.out.print(number1 + ", ");
        System.out.print(number2 + ", ");
        System.out.print(number3 + ", ");
        System.out.print(number4 + ", ");
        System.out.print(number5 + ", ");
        System.out.print(" Magic ball: " + magicballNumber);
        System.out.println("If you like to answer question to generate another set of numbers, (yes ,no)? :");
        String continueOption = scanner.nextLine();
    }

    }