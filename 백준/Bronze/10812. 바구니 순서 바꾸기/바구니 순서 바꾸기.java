
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		ArrayList<Integer> list =new ArrayList<>();
		ArrayList<Integer> copy =new ArrayList<>();
		
		int tc=Integer.parseInt(st.nextToken());
		int tr =Integer.parseInt(st.nextToken());
		
		for(int i=0;i<tc;i++) {
			list.add(i+1);
		}
		
		for(int i=0;i<tr;i++) {
			copy.clear();
			StringTokenizer st1 = new StringTokenizer(br.readLine()); //
			int f= Integer.parseInt(st1.nextToken());
			int e= Integer.parseInt(st1.nextToken());
			int m= Integer.parseInt(st1.nextToken());
			
			for(int mid=m;mid<=e;mid++) {
				copy.add(list.get(mid-1));
			}	
			
			  for(int mid=f;mid<m;mid++) {
				copy.add(list.get(mid-1)); 
			}
			  
			  for(int mid=0;mid<=e-f;mid++) {
				list.remove(f-1);
			}
			
			 for(int j=0;j<=e-f;j++) {
				  list.add(f+j-1,copy.get(j));
			 }
									
		}
		
		for(int num:list) {
			System.out.print(num+" ");
		}
		
	}

}
