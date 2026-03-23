/*
Problem: Occurrence of Character in a String

Description:
Write a program to count how many times a given character appears in a string.

Input:
hello
l

Output:
2
*/


import java.util.Scanner;
public class OccInString 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char c = s.next().charAt(0);
        s.close();
        char ch[] = str.toCharArray();
        int n = str.length();
        int hash[] = new int[256];
        for(int i = 0; i < n; i++)
        {
            hash[ch[i]]++;
        }
        for(int i = 0; i < n; i++)
        {
            if(ch[i] == c)
            {
                System.out.println(c + " - " + hash[ch[i]]);
                return;
            }
        }
    }    
}
