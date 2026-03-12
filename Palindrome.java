/*
Problem: Palindrome Number

Description:
Given an integer, check whether the number is a palindrome.
A number is called a palindrome if it reads the same forward and backward.

Input:
121

Output:
Palindrome
*/



import java.util.Scanner;
public class Palindrome 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int org = n, rev = 0;
        while(n > 0)
        {
            int r = n % 10;
            rev = rev * 10 + r;
            n /= 10;
        }
        if(org == rev)
            System.out.println("Palindrome");
        else
             System.out.println("Not Palindrome");
        s.close();
    }    
}
