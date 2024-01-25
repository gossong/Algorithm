import java.io.*;
import java.util.*;

public class Main{
    static int n, m;
    static int[] arr; // 수열을 담을 배열
    static boolean[] issued; // 특정 수가 쓰였는지 확인
    static StringBuilder sb;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[10]; // 1 ≤ M ≤ N ≤ 8
        issued = new boolean[10];
        sb = new StringBuilder();
        
        func(0); // 한 개도 택하지 않았으니 func(0) 호출
        
        System.out.println(sb);
    }
    
    // 재귀 함수
    public static void func(int k) { // 현재 k까지 수를 택했음
        if(k == m) { // m개를 모두 택했으면
            for(int i = 0; i < m; i++){
                sb.append(arr[i]).append(" "); // arr에 기록해둔 수를 출력
            }
            sb.append("\n");
            return;
        }
        
        for(int i = 1; i <= n; i++) { // 1부터 n까지의 수에 대해
            if(!issued[i]) { // 아직 i가 사용되지 않았으면
                arr[k] = i; // k번째 수를 i로 정함
                issued[i] = true; // i를 사용되었다고 표시
                func(k + 1); // 다음 수를 정하러 한 단계 더 들어감
                issued[i] = false; // k번째 수를 i로 정한 모든 경우에 대해 다 확인했으니, i를 이제 사용되지 않았다고 명시함.
            }
        }
    }
}