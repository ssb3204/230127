

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st =new StringTokenizer(br.readLine());
		int cnt=0;
		
		int num= Integer.parseInt(st.nextToken());
		int time= Integer.parseInt(st.nextToken());
		
		boolean arr[]= new boolean[time+1];
		
		for(int i=0;i<num;i++) {
			int c=Integer.parseInt(br.readLine());
			for(int j=1;j<=time/c;j++) {
				arr[c*j-1]=true;
			}
			
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==true) cnt++;
		}
		System.out.println(cnt);
	}

}
