/*
Problem: Find First Non-Repeating Element in Array

Description:
Write a program to find the first element in an array that does not repeat.

Input:
7
1 2 2 3 3 4 1

Output:
4
*/



import java.util.Scanner;
public class FirstNonRepeating 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        int hash[] = new int[10];
        for(int i = 0; i < n; i++)
        {
            arr[i] = s.nextInt();
            hash[arr[i]]++;
        }
        s.close();
        for(int i = 0; i < n; i++)
        {
            if(hash[arr[i]] == 1)
            {
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
 