import java.util.HashMap;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class Main
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0)
		{
			int n=Integer.parseInt(br.readLine());
			HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
			int max=0,count=0,start=0;
			for(int i=0;i<n;i++)
			{
				int a=Integer.parseInt(br.readLine());
				if(map.containsKey(a))
					{
						int p=map.get(a);
						if(p>=start)
						{
							start=p+1;
						}
						max=Math.max(max, i- start + 1);
						map.put(a,i);
					}
				else
					{
						map.put(a,i);
						max=Math.max(max, i + 1- start);
					}
			}
			System.out.println(max);
		}
	}
}	
					
			
