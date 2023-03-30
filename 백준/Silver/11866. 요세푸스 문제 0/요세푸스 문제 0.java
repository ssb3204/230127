import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main{

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		Queue<Integer> q = new LinkedList<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int f= Integer.parseInt(st.nextToken());
		int l= Integer.parseInt(st.nextToken());
		
		for(int i=1;i<=f;i++) {
			q.offer(i);
		}
		
		while(q.size()!=1) {
			for(int i=0;i<l-1;i++) {
				q.offer(q.poll());
				
			}
			sb.append(q.poll()).append(", ");
		}
		
		sb.append(q.poll()).append(">");
		System.out.println(sb);
	}

}
