/**Program to find the smallest element in an array.**/

import java.util.*;
public class Cycle_2_qn_2 
{
    public static void main(String args[])
    {
        Scanner qn2=new Scanner(System.in);
        System.out.print("Enter the no. of elements in the array: ");
        int n=qn2.nextInt();
        System.out.println("Enter the elements into the array: ");
        int arr[]=new int[n],i,buff;
        for(i=0;i<n;i++)
            arr[i]=qn2.nextInt();
        buff=arr[0];
        for(i=1;i<n;i++)
        {
            if(arr[i]<buff)
                buff=arr[i];
        }
        System.out.println("Smallest element in the array: "+buff);
    }
}

/**

Output:

Enter the no. of elements in the array: 5
Enter the elements into the array: 
2
8
4
3
9
Smallest element in the array: 2

**/
