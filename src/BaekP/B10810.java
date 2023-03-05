package BaekP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10810 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int box=Integer.parseInt(st.nextToken());
		int num=Integer.parseInt(st.nextToken());
		
		int arr[]= new int [box];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=0;
		}
		
		for(int i=0;i<num;i++) {
			StringTokenizer ball = new StringTokenizer(br.readLine());
			
			int a=Integer.parseInt(ball.nextToken());
			int b= Integer.parseInt(ball.nextToken());
			int c=Integer.parseInt(ball.nextToken());
			
			for(int j=a-1;j<b;j++) {
				arr[j]=c;	
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	
	}
}
