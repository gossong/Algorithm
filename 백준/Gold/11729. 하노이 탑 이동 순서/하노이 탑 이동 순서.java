import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int in = Integer.parseInt(br.readLine());

        int answer = (int) Math.pow(2, in) - 1;
//        int answer = (1 << in) - 1;
        sb.append(answer).append('\n');
        
        func(1, 3, in);
        
        System.out.println(sb.toString());

    }

    public static void func(int a, int b, int n) {
        if (n == 1) {
            sb.append(a).append(' ').append(b).append('\n');
            return;
        }
        func(a, 6 - a - b, n - 1);
        sb.append(a).append(' ').append(b).append('\n');
        func(6 - a - b, b, n - 1);
    }
}
