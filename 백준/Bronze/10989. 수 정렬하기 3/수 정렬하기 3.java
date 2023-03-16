
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int tc=Integer.parseInt(br.readLine());
		StringBuilder sb=new StringBuilder();
		int []arr=new int[tc];
		
		for(int i=0;i<tc;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++) {
			sb.append(arr[i]).append("\n");
		}
		System.out.print(sb);
	}

}
