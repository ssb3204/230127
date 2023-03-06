package B230306;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class B2751 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb= new StringBuilder();
		int tc =Integer.parseInt(br.readLine());
		
		ArrayList<Integer> list = new ArrayList<Integer>(); // arraylist 선언방법
		//ArrayList<원하는 변수타입> 이름 = new ArrayList<리스트에 들어갈수 있는 변수 지정>();
		
		for(int i=0;i<tc;i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
	
		Collections.sort(list); //collections.sort 공부 array.sort와 동일한 일 하는듯함
		
		for(int i:list) { //변수 타입 int i를 각각의 arraylist list의 값들을 저장
			sb.append(i).append('\n');
		}
		System.out.println(sb);
	}
	

}
