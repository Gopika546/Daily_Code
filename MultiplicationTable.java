/*
Problem: Multiplication Table

Description:
Write a program to print the multiplication table of a given number from 1 to 10.

Input:
5

Output:
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
...
5 x 10 = 50
*/

import java.util.Scanner;
public class MultiplicationTable 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        for(int i = 1; i <= 10; i++)
        {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }    
}
