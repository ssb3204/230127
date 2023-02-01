package BaekP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10807 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		 int n=Integer.parseInt(br.readLine());	 
		 int cnt=0;
		 int[] arr = new int[n];
				 
		 StringTokenizer st= new StringTokenizer(br.readLine());
		 
		 for(int i=0;i<n;i++) {
		 	arr[i]=Integer.parseInt(st.nextToken());
		 }
		 
		 String v=br.readLine();		
	    	for(int i=0;i<n;i++) {
	    		if(arr[i]==Integer.parseInt(v)) cnt++;
	    	}

		 System.out.print(cnt);
		 }
	}


