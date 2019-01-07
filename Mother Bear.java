/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String s=in.readLine();
		while(!s.equals("DONE"))
			s=s.replaceAll("[\\p{Punct} ]","");
			s=s.replaceAll("[\\s ]","");
			s=s.toLowerCase();
			StringBuffer sr=new StringBuffer(s);
			StringBuffer sr1=sr.reverse();
			if(sr1.equals(sr))
			{
				System.out.println("You won’t be eaten!");
			}
			else
			{
				System.out.println("Uh oh..");
			}
	}
}
