import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st =new StringTokenizer(br.readLine());
		StringBuilder sb =new StringBuilder();
		
		sb.append("<");
		
		int f=Integer.parseInt(st.nextToken());
		int l=Integer.parseInt(st.nextToken());
		
		Queue<Integer> queue = new LinkedList<>();
		
		for(int i=1;i<=f;i++) {
			queue.offer(i);
		}
		while(queue.size()!=1) {
			for(int i=0;i<l-1;i++) {
				queue.offer(queue.poll());
			}
			sb.append(queue.poll()+", ");
		}
		sb.append(queue.poll()+">");
		
		System.out.println(sb);
	}

}
