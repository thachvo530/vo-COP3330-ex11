/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Thach Vo
 */


package org.example;


import java.text.DecimalFormat;
import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {

        Scanner scan = new Scanner(System.in);

        System.out.print("How many euros are you exchanging? ");
        int euros1 = scan.nextInt();

        System.out.print("What is the exchange rate? ");
        double rate1 = scan.nextDouble();

        double usdollars = euros1 * rate1;

        DecimalFormat df = new DecimalFormat(".00");


        System.out.print(""+euros1+" euros at an exchange rate of "+rate1+" is\n"+df.format(usdollars)+" U.S. dollars.");
    }
}
