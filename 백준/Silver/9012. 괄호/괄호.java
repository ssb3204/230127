
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb =new StringBuilder();
		int tc=Integer.parseInt(br.readLine());
		
		for(int i=0;i<tc;i++) {
			sb.append(count(br.readLine())).append("\n");
		}	
		System.out.println(sb);
	}
	
	public static String count(String s) {
		int x=0;
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='(') {
				x++;
			}
			else if (x==0) {
				return "NO";
			}
			else {
				x--;
			}
			
		}
		if(x==0) {
			return "YES";
		}
		else {
			return "NO";
		}
	}
}
