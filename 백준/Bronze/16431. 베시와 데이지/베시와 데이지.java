
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args)throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		int Dx = Integer.parseInt(st1.nextToken());
		int Dy = Integer.parseInt(st1.nextToken());
		
		
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		int Bx = Integer.parseInt(st2.nextToken());
		int By = Integer.parseInt(st2.nextToken());
		
		
		StringTokenizer st3 = new StringTokenizer(br.readLine());
		int Jx = Integer.parseInt(st3.nextToken());
		int Jy = Integer.parseInt(st3.nextToken());
		
		
		int Bmove = Math.max((Math.abs(Dx - Jx)), (Math.abs(Dy - Jy)));
		int Dmove = Math.abs(Bx - Jx) + Math.abs(By - Jy);
		
		if(Bmove < Dmove) {
			System.out.println("bessie");
		}else if(Bmove > Dmove) {
			System.out.println("daisy");
		}else {
			System.out.println("tie");
		}
	}

}
