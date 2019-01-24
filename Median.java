import java.io.*;
import java.util.*;
class Main
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		ArrayList<Integer> a=new ArrayList<Integer>();
		while(in.hasNextInt())
		{
		
			int k=in.nextInt();
			a.add(k);
			
			for(int i=0;i<1;i++)
			{
				Collections.sort(a);
				if(a.size()%2==0)
				{
					System.out.println((a.get(a.size()/2-1)+a.get(a.size()/2))/2);
					if(a.size()==0)
						System.out.println(a.get(0));
				}
				else
					System.out.println(a.get(a.size()/2));
			}
		}
	}
}
