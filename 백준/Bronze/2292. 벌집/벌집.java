

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		
		int cnt=1;
		int range=2;
		
		if(num==1) {
			System.out.print(1);
		}
		else {
			while(range<=num) {
				range=range+(cnt*6);
				cnt++;
			}
			System.out.print(cnt);
		}
		
		
	}

}
