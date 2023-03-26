import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static boolean[] ss;
		
		public static void main(String[] args)throws IOException {
			// TODO Auto-generated method stub
			BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st =new StringTokenizer(br.readLine());
			StringBuilder sb =new StringBuilder();
			
			int f= Integer.parseInt(st.nextToken());
			int e= Integer.parseInt(st.nextToken());
			
			ss= new boolean[e+1];
			get_ss();

			for(int i=f;i<=e;i++) {
				if(!ss[i]) sb.append(i).append("\n");
			}
			System.out.println(sb);
		
		}
		public static void get_ss() {
			ss[0]=true;
			ss[1]=true;
			
			for(int i=2;i<=Math.sqrt(ss.length);i++) {
				if(ss[i])continue;
				for(int j=i*i;j<ss.length;j=j+i) {
					ss[j]=true;
				}
			}
		}
	}



