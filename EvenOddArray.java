/*
Problem: Count Even and Odd Numbers in an Array

Description:
Given an array of integers, determine how many numbers are even and how many are odd.

Input:
5
2 7 4 9 6

Output:
Even = 3
Odd = 2
*/


import java.util.Scanner;
public class EvenOddArray 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        int odd = 0,even = 0;
        for(int i = 0; i < n; i++)
        {
            arr[i] = s.nextInt();
            if(arr[i] % 2 == 0)
                even++;
            else 
                odd++;
        }
        System.out.println("Even Numbers : " + even);
        System.out.println("Even Numbers : " + odd);
        s.close();
    }    
}
