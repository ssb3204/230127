package BaekP;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10951 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		String str="";

		while((str=br.readLine())!=null) {
			StringTokenizer st = new StringTokenizer(str," ");	
			System.out.println(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()));
		}
	}
}
