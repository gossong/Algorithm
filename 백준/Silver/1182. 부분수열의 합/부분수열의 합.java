import java.util.*;
public class Main{
    static int n,s;
    static int[] arr;
    static int cnt = 0;
    
    public static void func(int cur, int tot) { // cur : 현재 인덱스, tot : 누적 합
    	if(cur == n) {
    		if(tot == s) cnt++;
    		return;
    	}
    	func(cur + 1, tot); // 부분 집합에 포함하지 않는 경우
    	func(cur + 1, tot + arr[cur]); // 부분 집합에 포합하는 경우
    }
    
    public static void main(String args[]) {
    	Scanner scanner = new Scanner(System.in);
    	n = scanner.nextInt();
    	s = scanner.nextInt();
    	arr = new int[n];
    	for(int i = 0; i < n; i++) {
    		arr[i] = scanner.nextInt();
    	}
    	func(0,0);
    	if (s == 0) cnt--; // s가 0일 때, 공집합 제외
    	System.out.println(cnt);
    }
}