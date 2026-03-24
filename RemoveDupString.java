/*
Problem: Remove Duplicate Characters from a String

Description:
Write a program to remove duplicate characters from a given string while maintaining the original order of characters.

Input:
programming

Output:
progamin
*/



import java.util.Scanner;
public class RemoveDupString
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        s.close();
        int n = str.length();
        char ch[] = str.toCharArray();
        int hash[] = new int[256];
        for(int i = 0; i < n; i++)
            hash[ch[i]]++;
        for(int i = 0; i < n; i++)
        {
            if(hash[ch[i]] > 0)
            {
                System.out.print(ch[i]);
                hash[ch[i]] = 0;
            }
        }
    }
}