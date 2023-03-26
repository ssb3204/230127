
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static int cnt=0;
	
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int tc= Integer.parseInt(br.readLine());
		
		int []s =new int[tc];
		StringTokenizer st =new StringTokenizer(br.readLine());
		
		for(int i=0;i<tc;i++) {
			s[i]=Integer.parseInt(st.nextToken());			
		}
		for(int i=0;i<tc;i++) {
			sss(s[i]);
		}
		System.out.println(cnt);
	}
	public static void sss(int num) {
		if(num<2) return;
		if(num==2) {
			cnt++;
			return;
		}
		for(int i=2;i<num;i++) {
			if(num%i==0)return;
		}
		cnt++;
		return;
	}
}
