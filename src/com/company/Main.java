package com.company;
import java.util.Scanner;

public class Main {
    public static void main( String[] args )
    { Scanner sc = new Scanner(System.in);

            String firstName;
            int age;
            String height;
            double gpa;

            System.out.print( "What is your first name? " );
            firstName = sc.next();

            System.out.print( "How old are you? " );
            age = sc.nextInt();

            System.out.print( "How tall are you? " );
            height = sc.next();

            System.out.print( "What is your GPA? " );
            gpa = sc.nextDouble();

            System.out.println("Your firstname is  " + firstName);
            System.out.println("Your age is " + age);
            System.out.println("Your height is " + height);
            System.out.println("Your GPA is " + gpa);

    }

}
