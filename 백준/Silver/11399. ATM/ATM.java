
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int tc= Integer.parseInt(br.readLine());
		int total=0;
		
		String str=br.readLine();
		StringTokenizer st =new StringTokenizer(str);
		
		Integer [] arr=new Integer[tc];
		
		for(int i=0;i<tc;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		for(int i=1;i<=arr.length;i++) {
			total=total+arr[i-1]*i;
		}
		
		System.out.println(total);
	}

}
