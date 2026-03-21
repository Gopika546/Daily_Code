/*
Problem: Month Days

Description:
Write a Java program to display the number of days in a given month.
If the month is February, display "28/29 days".
If the month is April, June, September, or November, display "30 days".
For all other months, display "31 days".

Input:
February

Output:
28/29 days
*/


import java.util.Scanner;
public class MonthlyDays
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String month = s.next();
        if(month.equals("February"))
            System.out.println("28 / 29 Days");
        else if(month.equals("April") || month.equals("June") ||
               month.equals("September") || month.equals("November"))
               System.out.println("30 Days");
        else
            System.out.println("31 Days");
    }    
}
