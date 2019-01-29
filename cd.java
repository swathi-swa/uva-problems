import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;
class Main {
	
	public static void main (String [] abc) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		while (!(s=br.readLine()).equals("0 0")) {
			StringTokenizer st=new StringTokenizer(s);
			int M=Integer.parseInt(st.nextToken());
			int N=Integer.parseInt(st.nextToken());
			
			HashSet<String> setM=new HashSet<>();
			for (int i=0;i<M;i++) setM.add(br.readLine());
			int count=0;
			for (int i=0;i<N;i++) if (setM.contains(br.readLine())) count++;
			
			System.out.println(count);
		}
		
	}
}

