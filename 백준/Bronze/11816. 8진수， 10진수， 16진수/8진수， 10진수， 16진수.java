

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str=br.readLine();
		int num=0;
		
		if(str.charAt(0)=='0'&&str.charAt(1)=='x') {
			String str1=str.substring(2);
			num=Integer.valueOf(str1,16);
		}else if(str.charAt(0)=='0') {
			String str1=str.substring(1);
			num=Integer.valueOf(str1,8);
		}else {
			num=Integer.parseInt(str);
		}
		
		System.out.println(num);
	}
		
}

