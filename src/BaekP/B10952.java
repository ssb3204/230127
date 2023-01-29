package BaekP;
import java.util.*;

public class B10952 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		
		while(true) {
			int a=scan.nextInt();
			int b=scan.nextInt();
			
			if(a==0&&b==0) {
				scan.close();
				break;
			}
			System.out.println(a+b);
			
		}
	}
}
