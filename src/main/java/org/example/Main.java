package org.example;


/******************************************************************************

 Online Java Compiler.
 Code, Compile, Run and Debug java program online.
 Write your code in this editor and press "Run" button to execute it.

 *******************************************************************************/
import java.util.*;
public class Main
{
    public static boolean ispalindrome(String s)
    {
        int l=s.length();
        int i=0,j=l-1,c=0;
        while(i<=j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                c++;
                break;
            }
            i++;
            j--;
        }
        if(c>=1)
        {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String temp=s;
        int i=97;
        char c;
        int p=0;
        while(!ispalindrome(s))
        {
            s=temp;
            s=s+(char)i;
            if(ispalindrome(s))
            {
                p=1;
                break;
            }
            i++;
        }
        c=(char)(i);
        System.out.println(c);

    }
}
