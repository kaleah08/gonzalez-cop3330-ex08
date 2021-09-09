package exercise;

/*UCF COP3330 Fall 2021 Assignment 1 Solution
Copyright 2021 Kaleah Gonzalez */


import java.util.Scanner;


public class App {
    public static void main( String[] args)
    {

        Scanner input = new Scanner(System.in);
        System.out.print("How many people? ");
        String firstString = input.next();
        int people = Integer.parseInt(firstString);

        System.out.print("How many pizzas do you have? ");
        String secondString = input.next();
        int pizzas = Integer.parseInt(secondString);

        System.out.print("How many slices per pizza? ");
        String thirdString = input.next();
        int slices = Integer.parseInt(thirdString);

        int total = slices * pizzas;
        int perPerson = total / people;
        int remainder = total % people;

        System.out.println(people + " people with " + pizzas + " pizzas" + "(" + total + " slices)");

        System.out.println( "Each person gets " + perPerson + " pieces of pizza.");

        System.out.println( "There are " + remainder + " leftover pieces." );

    }
}

