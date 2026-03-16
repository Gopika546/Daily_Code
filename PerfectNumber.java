/*
Problem: Perfect Number Check

Description:
Write a program to check whether a given number is a Perfect number or not.
A Perfect number is a positive integer that is equal to the sum of its
proper divisors excluding the number itself.

Input:
6

Output:
6 is a Perfect Number
*/


import java.util.Scanner;
public class PerfectNumber 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        int sum = 0;
        for(int i = 1; i <= n / 2; i++)
        {
            if(n % i == 0)
                sum += i;
        }
        if(sum == n)
            System.out.println("Perfect Number");
        else
            System.out.println("Not Perfect Number");
    }    
}
