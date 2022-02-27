/**Program to replace a particular character in a string**/

import java.util.*;

class Cycle_2_qn_12 
{
    public static void main(String args[])
    {
        Scanner rep=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String wrd=rep.nextLine();
        System.out.print("Enter the character to be replaced: ");
        String replaced=rep.nextLine();
        System.out.print("Enter the character to be placed instead: ");
        String placed=rep.nextLine();
        int len=wrd.length();
        for(int i=0;i<wrd.length();i++)
        {
            if(wrd.charAt(i)==replaced.charAt(0))
               wrd= wrd.replace("wrd.charAt(i)","placed.charAt(0)");
        }
        System.out.println("Updated String: "+wrd);
    }    
}

/**

Output:

Enter the string: Sun
Enter the character to be replaced: u
Enter the character to be placed instead: o
Updated String: Son

**/