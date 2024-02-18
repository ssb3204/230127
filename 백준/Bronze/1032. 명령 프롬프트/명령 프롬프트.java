import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num =Integer.parseInt(br.readLine());
		char c[]= br.readLine().toCharArray();
		
		for(int i=0;i<num-1;i++) {
			char com[]=br.readLine().toCharArray();			
			for(int j=0;j<c.length;j++) {
				if(com[j]!=c[j]) {
					c[j]='?';
				}
			}
			
		}
		System.out.println(c);
		
	}

}
