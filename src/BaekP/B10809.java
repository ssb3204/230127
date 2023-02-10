package BaekP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10809 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int abc[]= new int [26];
		String s= br.readLine();
		
		for(int i=0;i<abc.length;i++) {
			abc[i]=-1;
		}
		
		for(int i=0;i<s.length();i++) {			 
			if(abc[s.charAt(i)-'a']==-1) abc[s.charAt(i)-'a']=i;
		}
		
		for(int i =0;i<abc.length;i++) {
			System.out.print(abc[i]+" ");			
		}
	}

}
