package BaekP;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10818 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int tc= Integer.parseInt(br.readLine());
		int[] arr= new int[tc];
		StringTokenizer st= new StringTokenizer(br.readLine());

		for(int i=0;i<tc;i++) {
			arr[i]= Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);						//import java.util 내부에 있는 Arrays 사용, Arrays.sort(배열)사용시 오름차순 정렬
		System.out.println(arr[0]+" "+arr[arr.length-1]);
		
	}
}
