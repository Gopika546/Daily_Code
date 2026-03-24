/*
Problem: Swap First and Last Character of a String

Description:
Write a program to swap the first and last characters of a given string.
If the string contains only one character, return the string as it is without any changes.

Input:
hello

Output:
oellh
*/



import java.util.Scanner;
public class SwapFirstLastCharString 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        str = str + " ";
        int n = str.length();
        char ch[] = str.toCharArray();
        int j = 0, k = 0;
        for(int i = 0; i < n; i++)
        {
            if(ch[i] == ' ')
            {
                k = i - 1;
                char temp = ch[k];
                ch[k] = ch[j];
                ch[j] = temp;
                j = i + 1;
            }
        }
        System.out.println(new String(ch));
    }    
}
 