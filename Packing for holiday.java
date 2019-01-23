import java.util.*;
import java.io.*;
import java.lang.*;
class Main
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		for(int i=1;i<=t;i++)
		{
			int a=in.nextInt();
			int b=in.nextInt();
			int c=in.nextInt();
			if(a>20 || b>20 || c>20)
			{
				System.out.println("Case " +i+": bad");
			}
			else
			{
				System.out.println("Case " +i+": good");
			}
		}
	}
}
