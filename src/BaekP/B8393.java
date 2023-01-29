package BaekP;
import java.util.*;

public class B8393 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int c=0;
		int n=scan.nextInt();
		scan.close();
		
		for(int i=1;i<=n;i++) {
			c=c+i;
		}
		System.out.println(c);
	}

}
