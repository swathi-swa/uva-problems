import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt(), test = 1;
    while(t-->0)
    {
        int n=sc.nextInt();
        int a[] = new int[n+1];
        for(int i = 1; i <= n; i++)
            a[i]=sc.nextInt();
        int k = 0, ans;
        for(int i = 1; i <= n; i++) 
        {
            if(a[i]-a[i-1] > k)
                k = a[i]-a[i-1];
        }
        ans = k;
        for(int i = 1; i <= n; i++)
        {
            if(a[i]-a[i-1] == k)
                k--;
            else if(a[i]-a[i-1] > k) 
            {
                ans++;
                break;
            }
        }
        System.out.println("Case "+(test++)+": "+ans);
    }
	}
}
