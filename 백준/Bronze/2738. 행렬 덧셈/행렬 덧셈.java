

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st =new StringTokenizer(br.readLine());
		
		int x= Integer.parseInt(st.nextToken());
		int y= Integer.parseInt(st.nextToken());
		
		int arr[][]=new int [x][y];
		int arr2[][]=new int [x][y];

		for(int i=0;i<x;i++) {
			StringTokenizer st1 =new StringTokenizer(br.readLine());
			for(int j=0;j<y;j++) {			
				arr[i][j]=Integer.parseInt(st1.nextToken());
			}
		}		
		
		  for(int i=0;i<x;i++) { 
			  StringTokenizer st2 =new StringTokenizer(br.readLine());
			  for(int j=0;j<y;j++) {			  
		  arr2[i][j]=Integer.parseInt(st2.nextToken());
			  } 
		}
		  
		for(int i=0;i<x;i++) {
			
			for(int j=0;j<y;j++) {
				System.out.print(arr[i][j]+arr2[i][j]+" ");
			}
			System.out.println("");
		}
		
		
	}
}
