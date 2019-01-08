import java.util.*;
import java.io.*;
import java.lang.*;
class Main
{
	public static void main(String[]args)
	{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		int k=1;
		while(t-->0)
		{
			int a=in.nextInt();
			int b=in.nextInt();
			int s=0;
			
			for(int i=a;i<=b;i++)
			{
				if(i%2!=0)
				s=s+i;
			}
			System.out.println("Case"+" "+k+":"+" "+s);
			k++;
		} 
	}
}
