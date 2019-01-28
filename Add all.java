import java.io.*;
import java.util.*;
import java.lang.*;
class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		while(!(s=br.readLine()).equals("0"))
		{
			PriorityQueue<Integer> n=new PriorityQueue<>();
			int n1=Integer.parseInt(s);
			StringTokenizer so=new StringTokenizer(br.readLine());
			for(int i=0;i<n1;i++)
			n.offer(Integer.parseInt(so.nextToken()));
			int t=0;
			{
			while(!n.isEmpty())
				int c=n.poll();
				if(!n.isEmpty())
				{
					c+=n.poll();
					t+=c;
					n.offer(c);
				}
			}
			System.out.println(t);
		}

	}
}
