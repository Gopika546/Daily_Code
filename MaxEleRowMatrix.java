/*
Problem: Maximum Element in Each Row of a Matrix

Description:
Write a program to find the maximum element in each row of a given matrix.

Input:
2 3
1 5 3
4 2 6

Output:
5
6
*/



import java.util.Scanner;
public class MaxEleRowMatrix
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        int c = s.nextInt();
        int arr[][] = new int[r][c];
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                arr[i][j] = s.nextInt();
            }
        }
        for(int i = 0; i < r; i++)
        {
            System.out.println(max(arr[i]));
        }
    }    
    private static int max(int arr[])
    {
        int n = arr.length;
        int maxr = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++)
        {
            if(arr[i] > maxr)
                maxr = arr[i];
        }
        return maxr;
    }
}
