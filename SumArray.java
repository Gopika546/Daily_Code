/*
Problem: Sum of Elements in an Array

Description:
Given an array of integers, calculate and print the sum of all elements.

Input:
4
3 7 2 8

Output:
20
*/


import java.util.Scanner;
public class SumArray 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++)
        {
            arr[i] = s.nextInt();
            sum += arr[i];
        }
        System.out.println(sum);
        s.close();
    }    
}
