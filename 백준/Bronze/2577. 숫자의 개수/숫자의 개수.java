
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author ryanp
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
       
       int arr[]=new int[10];
       
       int a=Integer.parseInt(br.readLine());
       int b=Integer.parseInt(br.readLine());
       int c=Integer.parseInt(br.readLine());
       int all=a*b*c;
       
       String s=String.valueOf(all);
       
       for(int i=0;i<s.length();i++){
           arr[s.charAt(i)-48]++;
       }
       for(int n:arr){
           System.out.println(n);
       }
    }
    
}
