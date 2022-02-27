/**Program to replace a particular element in an array**/

 import java.util.*;
public class Cycle_2_qn_3 
{
    public static void main(String args[])
    {
        Scanner qn3=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=qn3.nextInt();
        System.out.println("Enter the elements of the array: ");
        int arr[]=new int[n],i;
        for(i=0;i<n;i++)
            arr[i]=qn3.nextInt();
        System.out.print("Enter the element to be replaced: ");
        int replaced=qn3.nextInt();
        System.out.print("Enter the element to be placed instead: ");
        int placed=qn3.nextInt();
        for(i=0;i<n;i++)
        {
            if(arr[i]==replaced)
                arr[i]=placed;
        }
        System.out.println("Updated array: ");
        for(i=0;i<n;i++)
            System.out.println(arr[i]);
    }    
}

/**

Output:
Enter the size of the array: 5
Enter the elements of thr array: 
8
3
6
4
5
Enter the element to be replaced: 4
Enter the element to be placed instead: 10
Updated array: 
8
3
6
10
5

**/
