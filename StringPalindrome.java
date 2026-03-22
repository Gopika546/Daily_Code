/*
Problem: Palindrome String Check

Description:
Write a program to determine whether a given string is a palindrome.
A string is called a palindrome if it reads the same forward and backward.

Input:
madam

Output:
String Palindrome
*/



import java.util.Scanner;
public class StringPalindrome
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        str = str.toLowerCase();
        int n = str.length();
        for(int i = 0; i < n; i++)
        {
            if(str.charAt(i) != str.charAt(n - 1 - i))
            {
                System.out.println("Not String Palindrome");
                return;
            }
        }
        System.out.println("String Palindrome");
        s.close();
    }
}