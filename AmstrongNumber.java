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
        int temp = n;
        int dig = 0;
        while(temp > 0)
        {
            dig++;
            temp /= 10;
        }
        int sum = 0;
        temp = n;
        while(n > 0)
        {
            int r = n % 10;
            int pow = 1;
            for(int i = 0; i < dig; i++)
            {
                pow = pow * r;
            }
            sum += pow;
            n /= 10;
        }
        if(org == sum)
            System.out.println("Amstrong Number");
        else
            System.out.println("Not Amstrong Number");
    }    
}
