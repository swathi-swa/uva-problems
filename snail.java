import java.util.*;
import java.io.*;
import java.lang.*;
class Main
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNextInt())
		{
			double h=in.nextInt();
			double c=in.nextInt();
			double d=in.nextInt();
			double f=in.nextInt();
			if(h==0 && c==0 && d==0 && f==0)
			{
				break;
			}
			double s=(c*f)/100;
			double well=0;
			int day=0;
			while(well>=0 && well<=h)
			{
				day++;
				well=well+c;
				if(well>h)
				{
					break;
				}
				well=well-d;
				if(well<0.0)
				{
					break;
				}
				if(c-s>0.0)
				{
					c=c-s;
				}
				else
				{
					c=0;
				}
			}
			if(well>=h)
			{
				System.out.println("success on day" +" "+day);
			}
			else
			{
				System.out.println("failure on day" +" "+day);
			}
		}
	}
}
		
			
	
			
