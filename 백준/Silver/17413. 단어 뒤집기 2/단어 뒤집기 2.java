import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class Main {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Stack<Character> stack=new Stack<Character>();	
		int cnt=0;
		String s=br.readLine();
		StringBuilder sb =new StringBuilder();
		
		for(char ch: s.toCharArray()) {
			if(ch=='<') {
				cnt++;
				while(!stack.isEmpty()) {
					sb.append(stack.pop());
				}
				sb.append("<");
			}
			else if(ch=='>') {
				cnt--;
				sb.append(">");
			}
			else if(ch==' ') {
				while(!stack.isEmpty()) {
					sb.append(stack.pop());
				}
				sb.append(" ");
			}
			else {
				if(cnt==0) {
					stack.push(ch);
				}
				else {
					sb.append(ch);
				}
			}
		}
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		System.out.println(sb);
	}
}
