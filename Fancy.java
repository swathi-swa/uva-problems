import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Fancy
{
	public static void main (String[] args) 
	{
		Scanner in = new Scanner(System.in).useDelimiter("\\n");
		int t=in.nextInt();
		while(t-->0)
		{
			String st=in.next();
			List<String> s= Arrays.asList(st.split("\\s"));
			if(s.contains("not"))
			System.out.println("Real Fancy");
			else
			System.out.println("regularly fancy");
		}
	}
}
