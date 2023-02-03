package BaekP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B3052 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		boolean[] arr=new boolean[42];
		int cnt=0;
		
		for(int i=0;i<10;i++) { 
			arr[Integer.parseInt(br.readLine())%42]= true;	//특정 값을 배열에 저장 x, 위치에 대조시켜 배열 위치에 삽입
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==true) cnt++; //boolean 사용으로 값이 들어있다면 true, 전체 중 true 의 갯수
		}
		System.out.println(cnt);
	}

}
