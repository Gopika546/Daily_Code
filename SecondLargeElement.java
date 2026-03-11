/*
Problem: Find the Second Largest Element in an Array

Description:
Given an array of integers, find and print the second largest element.

Input:
5
10 5 20 8 15

Output:
15
*/


import java.util.Scanner;
public class SecondLargeElement 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = s.nextInt();
        }
        int large = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++)
        {
            if(arr[i] > large)
            {
                second = large;
                large = arr[i];
            }
            else if(arr[i] < large && arr[i] > second)
                second = arr[i]; 
        }
        System.out.println(second);
        s.close();
    }   
}
