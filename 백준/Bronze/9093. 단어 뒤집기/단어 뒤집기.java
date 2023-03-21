

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb= new StringBuilder();
		
		int tc= Integer.parseInt(br.readLine());

		for(int i=0;i<tc;i++) {
			StringTokenizer st= new StringTokenizer(br.readLine());
			
			while(st.hasMoreTokens()) {
				sb.append(new StringBuilder(st.nextToken()).reverse().append(" "));
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

}
