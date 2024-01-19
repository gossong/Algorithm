import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        
        System.out.println(func(n, r, c));
    }

    public static int func(int n, int r, int c) {
    	if(n==0) return 0;
        int half = (int) Math.pow(2, n-1); // 한 변의 길이의 절반
        
        // r, c가 몇 번의 사각형에 있는지
        if(r<half&&c<half) return func(n-1, r, c); // 1번 사각형
        if(r<half&&c>=half) return half*half + func(n-1, r, c-half); // 2번 사각형
        if(r>=half&&c<half) return 2*half*half + func(n-1, r-half, c); // 3번 사각형
        return 3*half*half + func(n-1, r-half, c-half); // 4번 사각형 or n=2일 때
    }
}
