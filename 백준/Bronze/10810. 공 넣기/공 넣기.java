
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		String str=br.readLine();
		StringTokenizer  st= new StringTokenizer(str);
		
		int a= Integer.parseInt(st.nextToken());
		int b= Integer.parseInt(st.nextToken());
		
		int[] arr1=new int[a];
		
		for(int i=0;i<b;i++) {
			st=new StringTokenizer(br.readLine());
			int f=Integer.parseInt(st.nextToken());
			int m=Integer.parseInt(st.nextToken());
			int l=Integer.parseInt(st.nextToken());
			
			for(int j=f-1;j<m;j++) {
				arr1[j]=l;
			}
		}
		
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
	}

}
