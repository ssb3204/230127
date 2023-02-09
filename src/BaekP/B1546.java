package BaekP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1546 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int tc= Integer.parseInt(br.readLine());
		double arr[]= new double[tc];

		StringTokenizer st= new StringTokenizer(br.readLine());
		for(int i=0;i<arr.length;i++) {
			arr[i]=Double.parseDouble(st.nextToken());
		}	
		
		Arrays.sort(arr);
		double m= arr[arr.length-1];
		double total=0;
		
		for(int i=0;i<arr.length;i++) {
			total+=(arr[i]/m)*100;
		}
		total= total/arr.length;
		System.out.println(total);
	}

}
