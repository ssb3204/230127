package B230306;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class B25305 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st =new StringTokenizer(br.readLine());
		
		int tc =Integer.parseInt(st.nextToken());
		int p =Integer.parseInt(st.nextToken());
	
		Integer arr[]=new Integer[tc];
		StringTokenizer st1 =new StringTokenizer(br.readLine());
		
		for(int i=0;i<tc;i++) {
			arr[i]=Integer.parseInt(st1.nextToken());
		}
		
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println(arr[p-1]);
		
	}

}
