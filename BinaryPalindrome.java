/*
Problem: Check Whether a Number is Palindrome in Binary

Description:
Given an integer number, convert it into its binary representation
and check whether the binary value reads the same forward and backward.

Input:
9

Output:
Binary Palindrome
*/


import java.util.Scanner;
class BinaryPalindrome
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        int bin = 0, x = 1;
        while(n > 0)
        {
            int r = n % 2;
            bin = bin + r * x;
            x *= 10;
            n /= 2;
        }
        int temp = bin, rev = 0;
        while(temp > 0)
        {
            int r = temp % 10;
            rev = rev * 10 + r;
            temp /= 10;
        }
        if(bin == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}