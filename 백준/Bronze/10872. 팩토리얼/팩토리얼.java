

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		 BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		 int tc= Integer.parseInt(br.readLine());
		 int all=1;
		 if(tc==1||tc==0) {
			 System.out.println(1);
		 }else {
			 for(int i=1;i<=tc;i++) {
				 all=all*i;
				 
			 }
			 System.out.println(all);
		 }
		
	}

}
