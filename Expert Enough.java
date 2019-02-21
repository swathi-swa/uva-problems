import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0)
        {
            int n1=in.nextInt();
            String[] s=new String[n1];
            int[] a=new int[n1];
            int b[]=new int[n1];
            for(int j=0;j<n1;j++)
            {
                s[j]=in.next();
                a[j]=in.nextInt();
                b[j]=in.nextInt();
            }
            int n2=in.nextInt();
            int[] c=new int[n2];
            for(int j=0;j<n2;j++)
            c[j]=in.nextInt();
            for(int i=0;i<n2;i++)
            {int cc=0,ind=0;
                for(int j=0;j<n1;j++)
                {
                    if(c[i]>=a[j]&&c[i]<=b[j])
                    {
                        cc++;
                        ind=j;
                    }
                }
                if(cc==1)
                {
                    System.out.println(s[ind]);
                }
                else
                {
                    System.out.println("UNDETERMINED");
                }
            }
            if(t>0)
            System.out.println();
        }
    }
}
