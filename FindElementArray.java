/*
Problem: Find Element in Array (Linear Search)

Description:
Write a program to search for a given element in an array.
If the element is found, print its index; otherwise, print "Not Found".

Input:
5
10 20 30 40 50
30

Output:
2
*/



import java.util.Scanner;
public class FindElementArray 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        int k = s.nextInt();
        for(int i = 0; i < n; i++)
        {
            if(arr[i] == k)
            {
                System.out.println(i);
                return;
            }
        }
        System.out.println("Not Found");
    }    
}
