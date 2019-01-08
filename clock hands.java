import java.util.Scanner;
import java.util.StringTokenizer;
class Main
{
	public static void main(String[]args)
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			String ti=in.next();
			StringTokenizer st=new StringTokenizer(ti, ":");
			int h=Integer.parseInt(st.nextToken());
			int m=Integer.parseInt(st.nextToken());
			if(h==0&&m==0)
			break;
			double an=Math.abs(0.5*(60*h-11*m));
			if(an>180)
			an=360-an;
			System.out.printf("%.3f\n",an);
		}
	}
}

		
