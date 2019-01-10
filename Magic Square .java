import java.util.*;
import java.lang.*;
import java.io.*;
class Main
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		for(int n=0;n<t;n++)
		{
			String s=br.readLine();
			s=s.replaceAll("\\p{Punct}","");
			s=s.replaceAll("\\s","");
			int h=(int)Math.sqrt(s.length()),k=0;
			if(h*h!=s.length())
			{
				System.out.println("Case #"+(n+1)+":\nNo magic :(");
				continue;
			}
			char s2[][]=new char[h][h];
			for(int i=0;i<h;i++)
			{
				for(int j=0;j<h;j++)
				{
					s2[i][j]=s.charAt(k++);
				}
			}
			String a="";
			for(int i=0;i<h;i++)
			{
				for(int j=0;j<h;j++)
				{
					a=a+""+s2[i][j];
				}
			}
			if(!a.equals(s))
			{
				System.out.println("Case #"+(n+1)+":\nNo magic :(");
				continue;
			}
			a="";
			for(int i=0;i<h;i++)
			{
				for(int j=0;j<h;j++)
				{
					a=a+""+s2[j][i];
				}
			}
			if(!a.equals(s))
			{
				System.out.println("Case #"+(n+1)+":\nNo magic :(");
				continue;
			}
			a="";
			for(int i=h-1;i>=0;i--)
			{
				for(int j=h-1;j>=0;j--)
				{
					a=a+""+s2[i][j];
				}
			}
			if(!a.equals(s))
			{
				System.out.println("Case #"+(n+1)+":\nNo magic :(");
				continue;
			}
			a="";
			for(int i=h-1;i>=0;i--)
			{
				for(int j=h-1;j>=0;j--)
				{
					a=a+""+s2[j][i];
				}
			}
			if(!a.equals(s))
			{
				System.out.println("Case #"+(n+1)+":\nNo magic :(");
				continue;
			}
			System.out.println("Case #"+(n+1)+":\n"+h);
		}
	}
}
			

