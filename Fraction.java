import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	
	public static void main (String [] abc) throws IOException  {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		while ((s=br.readLine())!=null) {
			int k=Integer.parseInt(s);
			StringBuilder sb=new StringBuilder();
			int count=0;
			for (double y=k+1;y<=2*k;y++) {
				double x=(k*y)/(y-k);
				if ((int)(double)x==x) {
					sb.append("1/");
					sb.append(k);
					sb.append(" = 1/");
					sb.append((int)x);
					sb.append(" + 1/");
					sb.append((int)y);
					sb.append("\n");
					count++;
				}
			}
			System.out.println(count);
			System.out.print(sb.toString());
		}
	}
}