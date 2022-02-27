/**Program to multiply two matrices**/

import java.util.*;

class Cycle_2_qn_8
{
    public static void main(String args[])
    {
        Scanner pdt=new Scanner(System.in);
        System.out.println("Enter the dimension of the first matrix(m*n): ");
        int r1=pdt.nextInt();
        System.out.println("*");
        int c1=pdt.nextInt();
        System.out.println("Enter the dimensions of  the second matrix(m*n): ");
        int r2=pdt.nextInt();
        System.out.println("*");
        int c2=pdt.nextInt();
        if(c1==r2)
        {
            int i,j,a,b,k,sum=0;
            System.out.println("Enter the elements in first matrix: ");
            int arr1[][]=new int[r1][c1];
            for(i=0;i<r1;i++)
            {
                for(j=0;j<c1;j++)
                {
                    a=i;
                    b=j;
                    System.out.print("["+(a+1)+"]["+(b+1)+"]: ");
                    arr1[i][j]=pdt.nextInt();
                }
            }
            System.out.println("Enter the elements of the second matrix: ");
            int arr2[][]=new int[r2][c2];
            for(i=0;i<r2;i++)
            {
                for(j=0;j<c2;j++)
                {
                    a=i;
                    b=j;
                    System.out.print("["+(a+1)+"]["+(b+1)+"]: ");
                    arr2[i][j]=pdt.nextInt();
                }
            }
            int product[][]=new int[c1][r2];
            
                for(i=0;i<r1;i++)
                {
                    for(j=0;j<c2;j++)
                    {
                        for(k=0;k<r2;k++)
                            sum+=arr1[i][k]*arr2[k][j];
                        product[i][j]=sum;
                        sum=0;
                    }
                }
            
            System.out.println("-----Resultant matrix----- ");
            for(i=0;i<r1;i++)
            {
                for(j=0;j<c2;j++)
                {
                        a=i;
                        b=j;
                        System.out.print("["+(a+1)+"]["+(b+1)+"]: "+product[i][j]);
                        System.out.println();
                }
            }
        }
        else
        {
            System.out.println("Invalid entry!");
            System.out.println("-----NOTE: The column size of the first matrix and the row size of the second matrix must be same.-----");
        }
    }
}

/**

Output:

Enter the dimension of the first matrix(m*n): 
2
*
2
Enter the dimensions of  the second matrix(m*n): 
2
*
2
Enter the elements in first matrix: 
[1][1]: 1
[1][2]: 2
[2][1]: 3
[2][2]: 4
Enter the elements of the second matrix: 
[1][1]: 1
[1][2]: 2
[2][1]: 3
[2][2]: 4
-----Resultant matrix----- 
[1][1]: 7
[1][2]: 10
[2][1]: 15
[2][2]: 22

**/