/*
Problem: Sort Positive and Negative Numbers in an Array

Description:
Write a program to arrange the numbers in an array such that
all negative numbers appear first followed by all positive numbers.

Input:
6
3 -2 5 -7 1 -4

Output:
-2 -7 -4 3 5 1
*/



import java.util.Scanner;
public class PositiveNegativeSort 
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
        s.close();
        sort(n,arr);
        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
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
