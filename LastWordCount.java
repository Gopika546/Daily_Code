/*
Problem: Length of Last Word in a String

Description:
Write a program to find the length of the last word in a given string.
A word is defined as a sequence of characters separated by spaces.

Input:
Hello World

Output:
5
*/



import java.util.Scanner;
public class LastWordCount 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        str = " " + str;
        int n = str.length();
        int count = 0;
        for(int i = n - 1; str.charAt(i) != ' '; i--)
        {
            count++;
        }
        System.out.println(count);
    }    
}
