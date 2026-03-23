/*
Problem: Sort a Matrix

Description:
Write a program to sort all elements of a matrix in ascending order.
After sorting, place the elements back into the matrix row-wise.

Input:
2 2
4 3
1 2

Output:
1 2
3 4
*/

import java.util.Scanner;
public class SortMatrix 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        int c = s.nextInt();
        int arr[][] = new int[r][c];
        int sort[] = new int[r * c];
        int k = 0;
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                arr[i][j] = s.nextInt();
                sort[k++] = arr[i][j];
            }
        }
        for(int i = 0; i < k; i++)
        {
            for(int j = i; j < k; j++)
            {
               int temp = sort[i];
               sort[i] = sort[j];
               sort[j] = temp; 
            }
        }
        k = 0;
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                arr[i][j] = sort[k++];
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }    
}
