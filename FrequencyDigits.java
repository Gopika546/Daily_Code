/*
Problem: Count Frequency of Digits in a Number

Description:
Write a program to count the frequency of each digit in a given number.

Input:
122333

Output:
1 -> 1
2 -> 2
3 -> 3
*/



import java.util.Scanner;
public class FrequencyDigits 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        int hash[] = new int[10];
        while(n > 0)
        {
            int r = n % 10;
            hash[r]++;
            n /= 10;
        }
        for(int i = 0; i < 10; i++)
        {
            if(hash[i] > 0)
                System.out.println(i + " -> " + hash[i]);

        }
    }    
}
