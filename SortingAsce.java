/*
Problem: Sorting an Array in Ascending Order

Description:
Write a program to sort the elements of an array in ascending order.

Input:
5
5 2 8 1 3

Output:
1 2 3 5 8
*/


import java.util.Scanner;
public class SortingAsce 
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
        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        s.close();
    }    
}
