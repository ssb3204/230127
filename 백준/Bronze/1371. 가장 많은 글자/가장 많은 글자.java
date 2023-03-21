

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;
		int[] arr = new int[26];
		int i;
		while ((input = br.readLine()) != null){
			for (i = 0; i<input.length(); i++){
				if (!input.substring(i, i + 1).equals(" ")){
					arr[(int)input.substring(i, i + 1).charAt(0) - 97]++;
				}
			}
		}
		br.close();
		int maxValue = Integer.MIN_VALUE;
		for (i = 0; i<arr.length; i++){
			if (maxValue < arr[i]){
				maxValue = arr[i];
			}
		}
		for (i = 0; i<arr.length; i++){
			if (arr[i] == maxValue){
				System.out.print((char)(i + 97));
			}
		}
	}

}
