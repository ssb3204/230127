package BaekP;
import java.util.*;

public class B25304 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		
		int cost = scan.nextInt();
		int tc= scan.nextInt();
		
		int price=0;
		int num=0;
		int all=0;
		
		for(int i=0;i<tc;i++) {
			price=scan.nextInt();
			num= scan.nextInt();
			
			all=all+(price*num);
		}
		
		if(cost==all) System.out.println("Yes");
		else System.out.println("No");
		
	}

}
