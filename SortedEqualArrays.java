/*
Problem: Check if Two Arrays are Equal After Sorting

Description:
Given two arrays of integers, determine whether they contain
the same elements after sorting. If both arrays have the same
elements in the same quantity, they are considered equal.

Input:
Array1: 3 1 2
Array2: 2 3 1

Output:
Arrays are Equal
*/


import java.util.Scanner;
public class SortedEqualArrays 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr1[] = new int[n];
        for(int i = 0; i < n; i++)
            arr1[i] = s.nextInt();
        int m = s.nextInt();
        int arr2[] = new int[m];
        for(int i = 0; i < m; i++)
            arr2[i] = s.nextInt();
        if(n != m)
        {
            System.out.println("Not Equal");
            return;
        }
        sort(n, arr1);
        sort(m, arr2);
        for(int i = 0; i < n; i++)
        {
            if(arr1[i] != arr2[i])
            {
                System.out.println("Not Equal");
                return;
            }
        }
        System.out.println("Equal");
    }    
    public static void sort(int n, int arr[])
    {
        for(int i = 0; i < n; i++)
        {
            for(int j = i; j < n; j++)
            {
                if(arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
