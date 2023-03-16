

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb =new StringBuilder();
		int tc =Integer.parseInt(br.readLine());
		String arr[]=new String[tc];
		
		
		for(int i=0;i<tc;i++) {
			arr[i]=br.readLine();
		}
		
		Arrays.sort(arr, new Comparator<String>(){
			public int compare(String s1, String s2) {
				if(s1.length()==s2.length()) {
					return s1.compareTo(s2);
					//길이가 같으면 사전수 배열
				}
				else {
				return s1.length()-s2.length();
				//s1길이가 s2 길이보다 크다면
				}
			}
		});
		
		sb.append(arr[0]).append("\n");
		for(int i=1;i<tc;i++) {
			if(!arr[i].equals(arr[i-1])) {
				sb.append(arr[i]).append("\n");
			}
		}
		
		System.out.println(sb);
	}

}
