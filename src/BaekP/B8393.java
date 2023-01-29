package BaekP;
import java.util.*;

public class B8393 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int n=scan.nextInt();
		scan.close();
		
		for(int i=0;i<n;i++) {
			i+=i;
		}
		System.out.println(n);
	}

}
