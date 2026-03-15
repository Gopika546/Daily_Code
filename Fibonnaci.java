/*
Problem: Fibonacci Series

Description:
Write a program to generate the Fibonacci series up to N terms.
The Fibonacci sequence is a series in which each number is the sum
of the two preceding numbers, starting from 0 and 1.

Input:
6

Output:
0 1 1 2 3 5
*/



import java.util.Scanner;
public class Fibonnaci
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int first = 0;
        int second = 1;
        for(int i = 0; i < n; i++)
        {
            System.out.print(first + " ");
            int third = first + second;
            first = second;
            second = third;
        }
    }
}