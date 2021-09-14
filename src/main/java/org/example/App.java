/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Pedro Henrique Sotto-Mayor Pereira da Silva
 */
package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        String noun, verb, adjective, adverb;
        String author;
        System.out.print("Enter a noun: ");
        noun=sc.nextLine();
        System.out.print("Enter a verb: ");
        verb=sc.nextLine();
        System.out.print("Enter an adjective: ");
        adjective=sc.nextLine();
        System.out.print("Enter an adverb: ");
        adverb=sc.nextLine();
        System.out.println("Do you " + verb + " your " + adjective + " " + noun + " " + adverb + "? That's hilarious!");
    }
}
