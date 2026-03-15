/*
Problem: Leap Year

Description:
Write a program to check whether a given year is a leap year or not.
A year is considered a leap year if it is divisible by 4 but not by 100,
except when it is divisible by 400.

Input:
2024

Output:
2024 is a Leap Year
*/


import java.util.Scanner;
public class LeapYear 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        if((n % 4 == 0 && n % 100 != 0) || n % 400 == 0)
        {
            System.out.println("Leap Year");
        }
        else
            System.out.println("Not Leap Year");
    }    
}
