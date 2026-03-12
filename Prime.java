/*
Problem: Prime Number

Description:
Given an integer, determine whether it is a prime number.
A prime number is a number greater than 1 that has only two factors: 1 and itself.

Input:
7

Output:
Prime Number
*/



import java.util.Scanner;
public class Prime 
{
    public static void main(String[] args)
    {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    for(int i = 2; i <= n / 2; i++)
    {
        if(n % i == 0)
        {
            System.out.println("Not Prime");
            return;
        }
    }
    System.out.println("Prime");
    s.close();
}
}
