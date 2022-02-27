/**Program to find whether a string is palindrome or not.**/

import java.util.*;

class Cycle_2_qn_10
{
    public static void main(String args[])
    {
        Scanner pal=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String wrd=pal.nextLine();
        String palin="";
        int len=wrd.length();
        for(int i=len-1;i>=0;i--)
        {
            palin=palin+wrd.charAt(i);
        }
        if(wrd.equals(palin))
            System.out.println(wrd+" is palindrome");
        else
            System.out.println(wrd+" isn't palindrome");
    }
}

/**

Output:
Enter the string: madam
madam is palindrome

**/