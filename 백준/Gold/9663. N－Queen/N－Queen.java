import java.util.*;
public class Main{
    static int n;
    static int cnt;
    static boolean[] isused1; // column을 차지하고 있는지
    static boolean[] isused2; // / 방향 대각선을 차지하고 있는지
    static boolean[] isused3; // \ 방향 대각선을 차지하고 있는지
    
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        isused1 = new boolean[n];
        isused2 = new boolean[2*n-1];
        isused3 = new boolean[2*n-1];
        func(0);
        System.out.println(cnt);
    }
    
    public static void func(int cur){ // cur 번째 row에 말을 배치할 예정
        if(cur == n){ // N개를 놓는데 성공했다면
            cnt++;
            return;
        }
        for(int i = 0; i < n; i++){ // (cur, i)에 퀸을 놓을 예쩡
            if(isused1[i] || isused2[i + cur] || isused3[cur - i + n - 1]) // column이나 대각선 중에 문제가 있다면
                continue;
            isused1[i] = true;
            isused2[i + cur] = true;
            isused3[cur - i + n - 1] = true;
            func(cur + 1);
            isused1[i] = false;
            isused2[i + cur] = false;
            isused3[cur - i + n - 1] = false;
        }
    }
}