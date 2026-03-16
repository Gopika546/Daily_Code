/*
Problem: Armstrong Number Check

Description:
Write a program to check whether a given number is an Armstrong number or not.
An Armstrong number is a number that is equal to the sum of its digits
each raised to the power of the total number of digits.

Input:
153

Output:
153 is an Armstrong Number
*/


import java.util.Scanner;
public class AmstrongNumber 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        int org = n;
        int sum = 0;
        while(n > 0)
        {
            int r = n % 10;
            sum += r * r * r;
            n /= 10;
        }
        if(org == sum)
            System.out.println("Amstrong Number");
        else
            System.out.println("Not Amstrong Number");
    }    
}
