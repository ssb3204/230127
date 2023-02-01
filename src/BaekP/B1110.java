package BaekP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1110 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));		
		int a= Integer.parseInt(br.readLine());

		int cnt=0;
		int change=a;
		
		do{
		if(a<10) {				
				a=(a*10)+a;
				cnt++;
			
		}else {
			a=((a%10)*10)+(((a/10)+(a%10))%10);
			cnt++;
		 }
		}while(a!=change);
		System.out.print(cnt);
		
		
	}

}
