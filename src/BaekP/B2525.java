package BaekP;
import java.util.*;
public class B2525 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		
		int h=scan.nextInt();
		int m=scan.nextInt();

		int em=scan.nextInt();
		int eh=0;
		
		eh =(em+m)/60;		
		h+=eh;
		m=(em+m)%60;
		
		if(h>=24) h=h-24;
		
		
		System.out.println(h+" "+m);
	}

}
