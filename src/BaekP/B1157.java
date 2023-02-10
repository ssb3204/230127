package BaekP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B1157 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int abc[]=new int [26];
		int big=0;
		char alp = 0;
		
		String s=br.readLine();
		s=s.toUpperCase();
		
		for(int i=0;i<s.length();i++) {
			abc[s.charAt(i)-'A']++;
		}
		
		for(int i=0;i<26;i++) {
			if(abc[i]>big) {
				big=abc[i];
				alp=(char)(i+65);
			}else if(abc[i]==big) {
				alp='?';
			}
		}
		
		System.out.print(alp);
	}

}
