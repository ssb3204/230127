package Tutoring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2675 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		int tc=Integer.parseInt(br.readLine());
		
		for(int i=0;i<tc;i++) {
			StringTokenizer st= new StringTokenizer(br.readLine());
			int n=Integer.parseInt(st.nextToken());
		    String abc =st.nextToken();
		    
		    for(int j=0;j<abc.length();j++) {
		    	for(int t=0;t<n;t++) {
		    		System.out.print(abc.charAt(j));
		    	}
		    }
		    System.out.println("");
		
		}
		
		
		
		
	}	
}
