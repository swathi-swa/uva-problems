import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	
	public static void main (String [] abc) throws IOException  {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		int testCase=1;
		while ((s=br.readLine())!=null && !s.equals("0 0")) {
			StringTokenizer st=new StringTokenizer(s);
			int n=Integer.parseInt(st.nextToken());
			int p=Integer.parseInt(st.nextToken());
			
			for (int i=0;i<n;i++) {
				br.readLine();
				//doesn't matter as those in RFP are from here.
			}
			
			String selectedCarName="";
			int selectedCarReqCount=0;
			double selectedCarPrice=0.0;
			
			for (int i=0;i<p;i++) {
				String currCarName=br.readLine();
				st=new StringTokenizer(br.readLine());
				double currCarPrice=Double.parseDouble(st.nextToken());
				int currCarReqCount=Integer.parseInt(st.nextToken());
				for (int i2=0;i2<currCarReqCount;i2++) {
					br.readLine();
					//doesn't matter as those in RFP are from req list.
				}
				if (currCarReqCount>selectedCarReqCount || (currCarReqCount==selectedCarReqCount && selectedCarPrice>currCarPrice)) {
					selectedCarName=currCarName;
					selectedCarReqCount=currCarReqCount;
					selectedCarPrice=currCarPrice;
				}
			}
			
			if (testCase > 1) {
				System.out.println();
			}
			
			System.out.println("RFP #"+(testCase++)+"\n"+selectedCarName);
		}
	}
}

