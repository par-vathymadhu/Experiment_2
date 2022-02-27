import java.util.*;

class str_parchar 
{
    public static void main(String args[])
    {
        int a=0;
        Scanner chr=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String wrd=chr.nextLine();
        System.out.print("Enter the charachter that needs to be found:");
        String srh=chr.nextLine();
        int len=wrd.length();
        for(int i=0;i<len;i++)
        {
            if(wrd.charAt(i)==srh.charAt(0))
                System.out.println(srh+" is found at "+(i+1)+" position in the string");
            else
                a++;
        }
        if(a==len)
            System.out.println(srh+" isn't found in the string");
    }
}    
