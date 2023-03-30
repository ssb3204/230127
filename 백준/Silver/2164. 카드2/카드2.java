import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		int tc= Integer.parseInt(br.readLine());
		Queue<Integer> queue = new LinkedList<>();
		
		for(int i=1;i<=tc;i++) {
			queue.offer(i);
		}
		while(queue.size()!=1) {
			queue.remove();
			queue.offer(queue.remove());
		}
		System.out.println(queue.poll());
	}

}
