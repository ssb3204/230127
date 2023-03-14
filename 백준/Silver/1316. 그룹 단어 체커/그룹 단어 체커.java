

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	 static BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub	
		int tc= Integer.parseInt(br.readLine());
		int cnt=0;
		for(int i=0;i<tc;i++) {
			if(word()) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
	
	public static boolean word() throws IOException{
		boolean word[]=new boolean[26];
		int prev=0;
		String s=br.readLine();
		
		for(int i=0;i<s.length();i++) {
			int alp=s.charAt(i);
			if(prev!=alp) {
				if(word[alp-'a']==false) {
					word[alp-'a']=true;
					prev=alp;
				}
				else {
					return false;
				}
			}
		}
	return true;
	}
}
