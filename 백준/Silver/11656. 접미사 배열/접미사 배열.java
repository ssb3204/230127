import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb =new StringBuilder();
		
		String s=br.readLine();
		int len=s.length();
		
		String []alp =new String[len];
	
		for(int i=0;i<len;i++) {
			alp[i]=s;
			s=s.substring(1);
		}
		
		Arrays.sort(alp);
	
		for(int i=0;i<len;i++) {
			System.out.println(alp[i]);
		}

	}

}
