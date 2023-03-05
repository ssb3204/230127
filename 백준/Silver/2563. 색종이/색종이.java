

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		int tc= Integer.parseInt(br.readLine());
		int cnt = 0;
		int arr[][]=new int [101][101];
		
		for(int i=0;i<tc;i++) {
			StringTokenizer st =new StringTokenizer(br.readLine());
			int x=Integer.parseInt(st.nextToken());
			int y=Integer.parseInt(st.nextToken());
			
			
			for(int x1=x;x1<x+10;x1++) {
				for(int y1=y;y1<y+10;y1++) {
					if(arr[x1][y1]!=1) {
						arr[x1][y1]=1;
						cnt++;
					}
				}
				
			}
		}
		
		System.out.println(cnt);
		
	}

}
