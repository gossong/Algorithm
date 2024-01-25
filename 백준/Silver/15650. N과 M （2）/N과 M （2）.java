import java.io.*;
import java.util.*;

public class Main{
    static int n, m;
    static int[] arr;
    static boolean[] issued;
    static StringBuilder sb;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[10];
        issued = new boolean[10];
        sb = new StringBuilder();
        
        func(1, 0);
        
        System.out.println(sb);
    }
    
    public static void func(int idx, int k) {
        if(k == m) {
            for(int i = 0; i < m; i++){
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
     // idx를 증가시키면서 idx부터 재귀 호출
        for(int i = idx; i <= n; i++) {
            if(!issued[i]) { 
                arr[k] = i;
                issued[i] = true;
                func(i + 1, k + 1);
                issued[i] = false;
            }
        }
    }
}