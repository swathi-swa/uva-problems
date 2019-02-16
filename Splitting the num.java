import java.util.*;
import java.io.*;
import java.lang.*;
class Main
{
public static void main(String[]args)
{
Scanner in=new Scanner(System.in);
while(in.hasNext())
{
	int n=in.nextInt();	
	if(n==0)
		break;
	String s=new StringBuilder(Integer.toBinaryString(n)).reverse().to.String();
	String a="";
	String b="";
	boolean f=false;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)=='1')
		{
			if(f)
			{
				a+="0";
				b+="1";
			}
			else
			{	
				a+="1";
				b+="0";
			}
			f=!f;
		}
		else
		{
			a+="0";
			b+="0";
		}
		System.out.println(Integer.parseInt(new StringBuilder(a).reverse().toString(),2)+" "+Integer.parseInt(new StringBuilder(b).reverse().toString(),2));
	}	
	}
	}
}













