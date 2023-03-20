
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		long k=Long.parseLong(st.nextToken());
		long n=Long.parseLong(st.nextToken());
		long sum=(k+n)*(k-n+1)/2;
		
		if(n>k) {
			sum=(n+k)*(n-k+1)/2;
		}
		System.out.print(sum);
	}

}
