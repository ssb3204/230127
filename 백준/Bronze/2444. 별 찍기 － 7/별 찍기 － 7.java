

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int tc =Integer.parseInt(br.readLine());
		
		for(int i=1;i<=tc;i++) {
			for(int j=0;j<tc-i;j++) {
				System.out.printf(" ");
			}
			for(int j=0;j<i*2-1;j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		for(int i=tc-1;i>0;i--) {
			for(int j=tc-i;j>0;j--) {
				System.out.printf(" ");
			}
			for(int j=i*2-1;j>0;j--) {
				System.out.printf("*");
			}
			
			System.out.println();
		}
	}

}
