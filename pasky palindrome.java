import java.util.*;
import java.lang.*;
import java.io.*;
class Main
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			String s=in.next();
			HashSet<String> sub=new HashSet<String>();
			for(int i=0;i<s.length();i++)
			{
			for(int j=i+1;j<=s.length();j++)
			{
			StringBuilder sb1=new StringBuilder(s.substring(i,j));
			StringBuilder sb2=new StringBuilder(s.substring(i,j));
			if(sb1.toString().equals(sb2.reverse().toString()))
			sub.add(sb1.toString());
			}
			}
			System.out.println("The string "+"\'"+s+"\'"+" contains "+sub.size()+" palindromes.");
		}
	}
}
