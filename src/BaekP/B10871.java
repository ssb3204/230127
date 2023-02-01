package BaekP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10871 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer test =new StringTokenizer(br.readLine());
		
		int n =	Integer.parseInt(test.nextToken());
		int[] arr=new int[n];
		
		int small =Integer.parseInt(test.nextToken());
		
		StringTokenizer st =new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
			if(arr[i]<small) {
				System.out.print(arr[i]+" ");
			}
		}
	}

}
