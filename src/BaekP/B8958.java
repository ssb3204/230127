package BaekP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class B8958 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int tc= Integer.parseInt(br.readLine());
		StringBuilder sb=new StringBuilder();	
		String [] arr= new String[tc];
		
		for(int i=0;i<tc;i++) {
			arr[i]=br.readLine();
		}
		for(int i=0; i<tc;i++) {
			int cnt=0;
			int sum=0;
			for(int j=0; j <arr[i].length();j++) {
				if(arr[i].charAt(j) == 'O') {
					cnt++;
				}else {
					cnt=0;
				}
				sum+= cnt;
			}
			sb.append(sum).append("\n");
		}
		System.out.println(sb);
	}
}
