/*
Problem: Sum of Digits Until Single Digit

Description:
Given an integer, repeatedly find the sum of its digits
until the result becomes a single-digit number.

Input:
9875

Output:
2
*/



import java.util.Scanner;
public class SumOfDigit 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        if(n % 9 == 0)
            System.out.println("9");
        else
            System.out.println(n % 9);
    }    
}
