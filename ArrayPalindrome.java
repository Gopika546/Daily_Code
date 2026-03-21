/*
Problem: Check Whether an Array is Palindrome

Description:
Write a program to check whether the given array is a palindrome.
An array is said to be a palindrome if it reads the same forward and backward.

Input:
5
1 2 3 2 1

Output:
Palindrome Array
*/


import java.util.Scanner;
public class ArrayPalindrome 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        for(int i = 0; i < n; i++)
        {
            if(arr[i] != arr[n - i - 1])
            {
                System.out.println("Not Palindrome Array");
                return;
            }
        }
        System.out.println("Palindrome Array");
    }    
}
