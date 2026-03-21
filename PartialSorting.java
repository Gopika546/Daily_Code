/*
Problem: Sort First Half Ascending and Second Half Descending

Description:
Write a program to sort the first half of the array in ascending order
and the second half in descending order.

Input:
6
5 2 8 1 3 7

Output:
2 5 8 7 3 1
*/



import java.util.Scanner;
public class PartialSorting
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        int l = 0, r = n;
        int mid = (l + r) / 2;
        sortAsc(l, mid, arr);
        sortDes(mid, r, arr);
        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        s.close();
    }

    private static void sortDes(int mid, int r, int[] arr) 
    {
        for(int i = mid + 1; i < r; i++)
        {
            for(int j = i; j < r; j++)
            {
                if(arr[i] < arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    private static void sortAsc(int l, int mid, int[] arr) 
    {
        for(int i = l; i <= mid; i++)
        {
            for(int j = i; j <= mid; j++)
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
