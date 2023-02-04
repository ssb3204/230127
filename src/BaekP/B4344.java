package BaekP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B4344 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int [] arr;
		int tc =Integer.parseInt(br.readLine());	
		
		for(int i=0;i<tc;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int n=Integer.parseInt(st.nextToken());
			arr= new int[n];
			
			double total=0;
			
			for(int j=0;j<n;j++) {
				int grade=Integer.parseInt(st.nextToken());
				arr[j]=grade;
				total +=grade;
			}
			double  avg= (total/n); //성적 평균
			double cnt=0;			// 평균 성적 보다 높은 학생수 cnt++
		
			for(int j=0;j<n;j++) {
				if(arr[j]>avg) cnt++; //배열에 들어가 있는 수들 비교
			}

			System.out.printf("%.3f%%\n",(cnt/n)*100);
		}
		
		
	}

}
