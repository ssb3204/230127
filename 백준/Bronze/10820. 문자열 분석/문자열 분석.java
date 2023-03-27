import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		String s="";
		
		
		
		// a ~ z : 97 ~ 122
        // A ~ Z : 65 ~ 90
        // 0 ~ 9 : 48 ~ 57
        // ' ' : 32
		
		while((s=br.readLine())!=null) {
			int small=0;
			int big=0;
			int num=0;
			int blank=0;
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)>=97&&s.charAt(i)<=122) {
					small++;
				}
				else if(s.charAt(i)>=65&&s.charAt(i)<=90) {
					big++;
				}
				else if(s.charAt(i)>=48&&s.charAt(i)<=57) {
					num++;
				}else if(s.charAt(i)==32) {
					blank++;
				}	
				
			}
			System.out.print(small+" "+big+" "+num+" "+blank+"\n");
		}
		
	}

}
