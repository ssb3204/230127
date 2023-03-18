
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int tc= Integer.parseInt(br.readLine());
		int []arr=new int[tc];
		int total=0;

		for(int i=0;i<tc;i++) {
			arr[i]=Integer.parseInt(br.readLine());
			total=total+ arr[i];
		}
		
		Arrays.sort(arr);
		
		boolean max=false;
		int mode_max=0;
		int mode=10000;
		
		for(int i=0;i<tc;i++) {
			int jump =0;
			int count=1;
			int i_value=arr[i];
		
			for(int j=i+1;j<tc;j++) {
				if(i_value!=arr[j]) {
					break;
				}
				count++;
				jump++;
			}
			
			if(count>mode_max) {
				mode_max=count;
				mode=i_value;
				max=true;
			}
			else if(count==mode_max&&max==true) {
				mode =i_value;
				max=false;
			}
			i=i+jump;
		}
		
		System.out.println((int)Math.round((double)total/tc));
		System.out.println(arr[(tc/2)]);
		System.out.println(mode);
		System.out.println(arr[arr.length-1]-arr[0]);
		
	}

}
