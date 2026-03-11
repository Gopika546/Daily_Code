/*
Problem: Reverse a Number

Description:
Given an integer N, reverse its digits and print the reversed number.
Leading zeros in the reversed number should be ignored.

Input:
12345

Output:
54321
*/


import java.util.Scanner;
public class ReverseNum
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int rev = 0;
        while(n > 0)
        {
            int r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }
        System.out.println(rev);
        s.close();
    }
}