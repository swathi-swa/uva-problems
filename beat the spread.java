import java.util.*;
import java.io.*;
import java.lang.*;
class Main
{
	public static void main(String[]args)
	{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0)
		{
			int a=in.nextInt();
			int b=in.nextInt();
			int s=(a+b)/2;
			int d=(a-b)/2;
			if(a<b ||(a+b)%2!=0)
			{
				System.out.println("impossible");
			}
			else
			{
				System.out.println(Math.max(s,d)+" "+Math.min(s,d));
			}
		}	
	}
}
