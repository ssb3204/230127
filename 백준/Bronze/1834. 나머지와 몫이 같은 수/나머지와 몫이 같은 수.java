import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(bf.readLine());
        long sum = 0;

        for (int i = 1; i < n; i++){
            sum += (n * i) + i;
        }

        System.out.println(sum);
    }
}