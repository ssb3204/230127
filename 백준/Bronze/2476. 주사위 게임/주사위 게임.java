import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		
		int total=0;
		int max=0;
		for(int i=0;i<tc;i++) {
			String str=br.readLine();
			StringTokenizer st=new StringTokenizer(str);
			
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			int c=Integer.parseInt(st.nextToken());
			
			if(a==b&&a==c) {
				total=10000+a*1000;
			}else if(a==b&&b!=c) {
				total=1000+a*100;
			}else if(b==c&&a!=b) {
				total=1000+b*100;
			}else if(a==c&&b!=c) {
				total=1000+c*100;
			}else {
				total=Math.max(a, Math.max(b,c))*100;
			}
			
			max=Math.max(max, total);
        }
		System.out.println(max);
	}

}
