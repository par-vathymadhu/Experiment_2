/**Program to find frequency of a given character in a string**/

import java.util.*;
public class Cycle_2_qn_13 
{
    public static void main(String args[]) 
    {
        Scanner qn13=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s=qn13.next();
        System.out. print("Enter the string whose frequency needs to be found: ");
        char f=qn13.next().charAt(0);
        char a[]=s.toCharArray();
        int buff=0;
        for(int i=0;i<(s.length());i++)
        {
            if(a[i]==f)
                buff++;
        }
        System.out.println("Frequency: "+buff);
    }   
}

/**

Output:

Enter the string: Morning
Enter the string whose frequency needs to be found: n
Frequency: 2
**/
