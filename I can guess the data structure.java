import java.util.*;
import java.io.*;
class Main
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String sq;
		while((sq=br.readLine())!=null)
		{
			int t=Integer.parseInt(sq);
			Stack<Integer> s=new Stack<>();
				Queue<Integer> q=new LinkedList<>();
				PriorityQueue<Integer> p=new PriorityQueue<>(Collections.reverseOrder()); 
			boolean st=true,qu=true,pq=true;
			for(int i=0;i<t;i++)
			{
				String sm=br.readLine();
				int a=Integer.parseInt(sm.substring(0,1)),b=Integer.parseInt(sm.substring(2));
				if(a==1)
				{
					if(st)
						s.push(b);
							if(qu)
								q.offer(b);
							if(pq)
								p.offer(b);
				}
				else if(a==2)
				{
					if(st && (s.size()==0 || !s.pop().equals(b)))
						st=false;
					if(qu && (q.size()==0 || !q.poll().equals(b)))
						qu=false;
					if(pq && (p.size()==0 || !p.poll().equals(b)))
						pq=false;
				}
			}
			if(!st && !qu && !pq)
				System.out.println("impossible");
			else if((st && qu)||(st && pq)||(qu && pq))
				System.out.println("not sure");
			else if(st)
				System.out.println("stack");
			else if(qu)
				System.out.println("queue");
			else if(pq)
				System.out.println("priority queue");
		}
	}
}
			
