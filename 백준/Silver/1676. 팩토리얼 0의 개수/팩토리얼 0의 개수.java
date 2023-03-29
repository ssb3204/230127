import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		 BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

		 int cnt=0; 
		 int tc= Integer.parseInt(br.readLine());
		 
		 while(tc>=5) {
			 cnt+=tc/5;
			 tc/=5;
		 }

		System.out.println(cnt);
	}

}
