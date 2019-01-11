import java.util.*;
import java.io.*;
import java.lang.*;
class Main
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0)
		{
			int c=0;
			long s=in.nextInt();
			while(c<1000)
			{
				long k=rev(s);
				long sum=s+k;
				c++;
				long s1=rev(sum);
				if(s1==sum)
				{
					System.out.println(c+" "+s1);
					break;		
				}
				else
					s=sum;	
			}
		}
	}
			static long rev(long n)
			{
				long re1=0,s=n;
				while(n!=0)
				{
					re1=re1*10;
					re1=re1+n%10;
					n=n/10;	
				}
				return re1;
			}
}
			
			



