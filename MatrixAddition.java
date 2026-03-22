/*
Problem: Matrix Addition

Description:
Write a program to add two matrices of the same dimensions and display the resulting matrix.
Matrix addition is performed by adding corresponding elements of the two matrices.

Input:
2 2
1 2
3 4
5 6
7 8

Output:
6 8
10 12
*/


import java.util.Scanner;
public class MatrixAddition 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        int c = s.nextInt();
        int arr1[][] = new int[r][c];
        int arr2[][] = new int[r][c];
        int res[][] = new int[r][c];
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                arr1[i][j] = s.nextInt();
            }
        }
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                arr2[i][j] = s.nextInt();
            }
        }
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                res[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }    
}
