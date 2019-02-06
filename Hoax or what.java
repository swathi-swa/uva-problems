import java.util.*;
import java.io.*;
class Main
{
	public static void main (String [] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		while(!(s=br.readLine()).equals("0"))
		{
			int t=Integer.parseInt(s);
			long ans=0;
			TreeMap<Integer,Integer> map=new TreeMap<>();
			for(int i=0;i<t;i++)
			{
				StringTokenizer st=new StringTokenizer(br.readLine());
				int n=Integer.parseInt(st.nextToken());
				for(int j=0;j<n;j++)	
				{
					int h=Integer.parseInt(st.nextToken());
					map.put(h,map.getOrDefault(h,0)+1);
				}
				int highest=map.lastKey();
				if(map.get(lowest)==1)map.remove(highest);		
				else map.put(highest,map.get(highest)-1);
			
				int loest=map.firstKey();
				if(map.get(lowest)==1)map.remove(lowest);		
				else map.put(lowest,map.get(lowest)-1);
				
				ans+=(highest-lowest);
			}
			System.out.println(ans);
		}
	}
}
			
		

