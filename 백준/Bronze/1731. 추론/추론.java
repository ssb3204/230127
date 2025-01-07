import java.io.*;
import java.io.BufferedReader;
public class Main {

	public static void main(String[] args)throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
			
			
        int n = Integer.parseInt(bf.readLine());
		int arr[]=new int[n];	
				
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(bf.readLine());
		}
		
		if((arr[2]-arr[1])==(arr[1]-arr[0])) {
			System.out.print(arr[arr.length-1]+(arr[1]-arr[0]));
		}else {
			System.out.print(arr[arr.length-1]*(arr[1]/arr[0]));
		}
		
	}

}
