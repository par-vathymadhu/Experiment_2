/**Program to find the sum of elements in an array.**/

import java.util.*;
public class Cycle_2_qn_1 
{
    public static void main(String args[])
    {
        Scanner qn1=new Scanner(System.in);
        System.out.print("Enter the no. of elements in the array: ");
        int n=qn1.nextInt();
        System.out.println("Enter the elements into the array: ");
        int arr[]=new int[n],i,sum=0;
        for(i=0;i<n;i++)
            arr[i]=qn1.nextInt();
        for(i=0;i<n;i++)
            sum=sum+arr[i];
        System.out.println("Sum: "+sum);
    }
}

/**

Output:

Enter the no. of elements in the array: 4
Enter the elements into the array: 
1
2
3
4
Sum: 10
**/