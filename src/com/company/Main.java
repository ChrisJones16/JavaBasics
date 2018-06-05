package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Boolean - can be true or false
        Char -  holds a single character
        String - sequence of characters
        int - integer
        double - holds values including floating point values
        modulo - finds the remainder
        system.out.println - prints output
        Scanner -
         */

        // My own variables
        String userResponse = "user's answer";
        String computerResponse = "Mac is clearly better";

        Scanner input = new Scanner(System.in);
        System.out.println("Mac or Android?");

        userResponse = input.nextLine();

        System.out.println(computerResponse);

        System.out.println("Tacos or Buritos?");

        userResponse = input.nextLine();

        String foodChoice = "Tacos dude....duhhh";

        System.out.println(foodChoice);

        System.out.println("What is your age?");
        int age = input.nextInt();
        input.nextLine();

        System.out.println("You are " + age + " ... that's wack!");

        System.out.println("How much do you weigh?");
        double weight = input.nextDouble();
        input.next();

        String pounds = "Dang you weigh" + " " +  weight + " " + "pounds...incredible";

        System.out.println(pounds);

        System.out.println("So you are" + " " + age + " " + "and weigh" + " " + weight + " " + "pounds...correct?");

        userResponse = input.nextLine();

        System.out.println("ok then." + " " + "welcome to my website");















     }

}
