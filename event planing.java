import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args)
	{
	 Scanner ip=new Scanner(System.in);
	 while(ip.hasNextInt()){
	 int p=ip.nextInt();
	 int amt=ip.nextInt();
	 int h=ip.nextInt();
	 int w=ip.nextInt();
	 int b[]=new int[w];
	 int min=Integer.MAX_VALUE;
	 for(int i=0;i<h;i++)
	 {
	     int s=ip.nextInt();
	     for(int j=0;j<w;j++)
	     {
	        b[j]=ip.nextInt();
	        if(b[j]>=p&&((s*p)<=amt))
	        {
	            int temp = s*p;
	            if(temp<min)
	                min=temp;
	        }
	     }
	 }
	 if(min>amt)
	 System.out.println("stay home");
	 else
	 System.out.println(min);
	 }
	}
}

