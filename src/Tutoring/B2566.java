package Tutoring;
import java.util.*;
import java.lang.*;

public class B2566 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		int [][]arr= new int[9][9];
		int big=arr[0][0];
		
		int x=0;
		int y=0;
		
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				arr[i][j]=scan.nextInt();
				if(big<arr[i][j]) {
					big=arr[i][j]; 
					x=i;  
					y=j;
				}
			}
		}
		scan.close();
		
		System.out.println(big);
		System.out.println((x+1)+" "+(y+1));
		
	}
}
