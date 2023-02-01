package BaekP;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B15552 {

	public static void main(String[] args) throws IOException  {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int tc= Integer.parseInt(br.readLine());

		for(int i=0;i<tc;i++) {
			StringTokenizer st= new StringTokenizer(br.readLine());
			// br.readLine()으로 한줄 받아오면 공백을 구별자로 한다는 선언 필요 없나?
			//구별 없으면 ex) 1 1을 어떻게 두 개의 정수로 보는가?
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			
			bw.write(a+b+"\n");
		}
		bw.flush();
		bw.close();
		
		br.close();
	}

}
