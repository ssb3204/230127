import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		StringTokenizer st= new StringTokenizer(br.readLine());
	
		int arr[]=new int[tc+1];
		int sum[]=new int[tc+1];
        long total=0;
        
		for(int i=1;i<=tc;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
			sum[i]=sum[i-1]+arr[i];
		}
		for(int i=1;i<=tc;i++) {
			total+=arr[i]*(sum[tc]-sum[i]);
		}
		System.out.println(total);
	}

}
