import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {	
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new LinkedList<>();
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int tc= Integer.parseInt(br.readLine());
		int back =-1;
		
		for(int i=0;i<tc;i++) {
			StringTokenizer st =new StringTokenizer(br.readLine());
			
			switch(st.nextToken()) {
				case "push":
					back=Integer.parseInt(st.nextToken());
					queue.offer(back);
					break;
					
				case "pop":
					if(queue.isEmpty() ) {
						sb.append(-1).append("\n");
						break;
						
					}
						sb.append(queue.poll()).append("\n");
						break;
								
				case "size":
					sb.append(queue.size()).append("\n");
					break;
					
				case "empty":
					sb.append(queue.isEmpty()? 1:0).append("\n");
					break;
					
				case "front":
					sb.append(queue.isEmpty()? -1:queue.peek()).append("\n");
					break;		
					
				case "back":
					sb.append(queue.isEmpty()? -1:back).append("\n");
			}
		}
		System.out.println(sb);
	}

}
