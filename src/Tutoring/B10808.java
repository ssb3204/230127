package Tutoring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10808 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] abc=new int [26];
		
		String str= br.readLine();
		for(int i=0;i<str.length();i++) {
			abc[str.charAt(i)-97]++;
		}
		for(int i=0;i<abc.length;i++) {
			System.out.print(abc[i]+" ");
		}
	}
}
