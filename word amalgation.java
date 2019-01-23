import java.io.*;
import java.util.*;
import java.lang.*;

class Main 
{
    public static boolean anagram(String a,String b)
    {
        if(a.length()!=b.length())
        return false;
        char c[]=a.toCharArray();
        char d[]=b.toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);
        for(int i=0;i<a.length();i++)
        {
                if(c[i]!=d[i])
                return false;
        }
        return true;
    }
	public static void main (String[] args)
	{
		Scanner in=new Scanner(System.in);
		String s1;
		 ArrayList<String>s=new ArrayList<>();
		  ArrayList<String>t=new ArrayList<>();
		while(!(s1=in.next()).equals("XXXXXX"))
		    s.add(s1);
		while(!(s1=in.next()).equals("XXXXXX"))
		    t.add(s1);
		Collections.sort(s);
		int c=0;
		for(int i=0;i<t.size();i++)
		{
		    for(int j=0;j<s.size();j++)
		    {
		        if(anagram(t.get(i),s.get(j)))
		        {
		        System.out.println(s.get(j));
		        c++;
		        }
		    }
		    if(c==0)
		    System.out.println("NOT A VALID WORD");
		    c=0;
		    System.out.println("******");
	}
}
}
