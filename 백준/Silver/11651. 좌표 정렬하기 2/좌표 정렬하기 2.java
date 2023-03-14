

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int tc= Integer.parseInt(br.readLine());
		int [][] arr=new int[tc][2];
		int temp=0;
		int x=0;
		int y=0;
		for(int i=0;i<tc;i++) {
			StringTokenizer st= new StringTokenizer(br.readLine());
			x=Integer.parseInt(st.nextToken());
			y=Integer.parseInt(st.nextToken());			
			arr[i][1]=x;
			arr[i][0]=y;					
		}
		
		Arrays.sort(arr,(e1,e2) -> {
			if(e1[0]==e2[0]){
			return e1[1]-e2[1];
			}else {
			return e1[0]-e2[0];
			}		
		});
		

		for(int i=0;i<tc;i++) {
			System.out.println(arr[i][1]+" "+arr[i][0]);
		}
	}

}
