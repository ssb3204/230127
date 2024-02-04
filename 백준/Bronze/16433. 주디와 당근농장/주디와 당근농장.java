import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine().trim());

        int N = Integer.parseInt(tokenizer.nextToken());
        int R = Integer.parseInt(tokenizer.nextToken()) - 1;
        int C = Integer.parseInt(tokenizer.nextToken()) - 1;

        StringBuilder m= new StringBuilder();
        StringBuilder s= new StringBuilder();
        StringBuilder sb =new StringBuilder();
        
        if(C%2==0) {
        	for(int i=0;i<N;i++) {
        		if(i%2==0) {
        			m.append(".");
        			s.append("v");
        		}else {
        			m.append("v");
        			s.append(".");
        		}
        	}
        }else {
        	for(int i=0;i<N;i++) {
        		if(i%2==0) {
        			m.append("v");
        			s.append(".");
        		}else {
        			m.append(".");
        			s.append("v");
        		}
        	}
        }
        
        	if(R%2!=0) {
        		for(int j=0;j<N;j++) {
        			if(j%2==0) {
        				sb.append(m).append('\n');
        			}else {
        				sb.append(s).append('\n');
        			}
        			
        		}
        	}else if(R%2==0){
        		for(int j=0;j<N;j++) {
        			if(j%2==0) {
        				sb.append(s).append('\n');
        			}else {
        				sb.append(m).append('\n');
        			}
        			
        		}
        	}
        
        System.out.println(sb);
    }
}
