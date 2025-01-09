import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder tr = new StringBuilder();

        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                tr.append("*");
            }    
            tr.append("\n");
        }
        System.out.println(tr);
    }
}