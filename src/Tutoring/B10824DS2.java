package Tutoring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10824DS2 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		long ab= Long.parseLong(st.nextToken()+st.nextToken());
		long cd= Long.parseLong(st.nextToken()+st.nextToken());
	
		sb.append(ab+cd);
		
		System.out.println(sb);
	}

}
