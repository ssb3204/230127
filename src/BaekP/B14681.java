package BaekP;
import java.util.*;

public class B14681 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		
		int a=scan.nextInt();
		int b=scan. nextInt();
		
		if(a>0) {
			if(b>0) System.out.println("1");
			else System.out.println("4");
		}
		else if(a<0) {
			if(b>0)System.out.println("2");
			else System.out.println("3");
		}
	}

}
