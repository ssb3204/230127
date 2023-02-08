package Tutoring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1259 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			String arr=br.readLine();
			if(arr.equals("0")) break;
			int cnt=0;
			int len=arr.length();
			
			for(int i=0;i<len/2;i++) {			
				if(arr.charAt(i)!=arr.charAt(len-1-i)) {
					cnt++;
				}else {

				}
			}
			if(cnt==0)System.out.println("yes");
			else System.out.println("no");
		}
	}

}
