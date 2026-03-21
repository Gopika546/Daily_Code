/*
Problem: Login Authentication

Description:
Write a Java program to check whether the entered username and password are correct.
The valid username is "admin" and the valid password is "1234".
If both match, display "Login Successful"; otherwise, display "Invalid Credentials".

Input:
admin
1234

Output:
Login Successful
*/

import java.util.Scanner;
public class LoginAuthentication 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String user = s.nextLine();
        String pass = s.nextLine();
        String corrUser = "admin";
        String corrPass = "1234";
        boolean u = true;
        boolean p = true;
        if(user.length() != corrUser.length())
            u = false;
        else
        {
            for(int i = 0; i < user.length(); i++)
            {
                if(user.charAt(i) != corrUser.charAt(i))
                {
                    u = false;
                    break;
                }
            }
        }
        if(pass.length() != corrPass.length())
            p = false;
        else
        {
            for(int i = 0; i < pass.length(); i++)
            {
                if(pass.charAt(i) != corrPass.charAt(i))
                {
                    u = false;
                    break;
                }
            }
        }
        if(u && p)
            System.out.println("Login Successful");
        else
            System.out.println("Invalid Credentials");
    }    
}
