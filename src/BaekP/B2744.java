package BaekP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B2744 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		for(int i=0;i<s.length();i++) {
			char c= s.charAt(i);
			
			if(Character.isUpperCase(c)) System.out.print(String.valueOf(c).toLowerCase());
			else System.out.print(String.valueOf(c).toUpperCase());
	}
}
}