/*
Problem: Find All Indices of a Given Element

Description:
Write a program to find and print all the indices of a given element in an array.
If the element is not present, print "Not Found".

Input:
6
1 2 3 2 4 2
2

Output:
1 3 5
*/



import java.util.Scanner;
public class AllIndicesFind 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        int k = s.nextInt();
        int flag = 0;
        s.close();
        for(int i = 0; i < n; i++)
        {
            if(arr[i] == k)
            {
                flag = 1;
                System.out.print(i + " ");
            }
        }
        if(flag == 0)
            System.out.println("Not found");
    }    
}
