import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int num= Integer.parseInt(st.nextToken());
		int h =Integer.parseInt(st.nextToken());
		
		int arr[]= new int[num];
		
		StringTokenizer fruit = new StringTokenizer(br.readLine());
		
		for(int i=0;i<num;i++) {
			arr[i]=Integer.parseInt(fruit.nextToken());
		}
		
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<=h) {
				h++;
			}
		}
		
		System.out.println(h);
	}
}
