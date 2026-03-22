/*
Problem: Count Vowels and Consonants

Description:
Write a program to count the number of vowels and consonants in a given string.
Vowels are: a, e, i, o, u (both uppercase and lowercase)

Input:
programming

Output:
Vowels : 3
Consonants : 8
*/




import java.util.Scanner;
public class CountVowelsCons 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        str = str.toLowerCase();
        int vow = 0, cons = 0;
        for(int i = 0; i < str.length(); i++)
        {
            char c = str.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                vow++;
            else
                cons++;
        }
        System.out.println("Vowels : " + vow);
        System.out.println("Consonants : " + cons);
        s.close();
    }    
}
