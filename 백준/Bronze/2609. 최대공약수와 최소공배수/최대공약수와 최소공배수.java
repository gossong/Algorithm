import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main{
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int x = Math.max(n, m);
        int y = Math.min(n, m);
        
        System.out.println(gcd(x, y));
        System.out.println(lcm(x, y, gcd(x, y)));
        
    }
    
    // 최대 공약수
    public static int gcd(int x, int y){
        int r = x % y;
        if(r!=0){
            return gcd(y, r);
        }else{
            return y;
        }
    }
    
    // 최소 공배수
    public static int lcm(int x, int y, int z){
        return x * y / z;
    }
}