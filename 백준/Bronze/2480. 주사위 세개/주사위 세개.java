import java.util.Scanner;

public class Main{
    public static void main(String args[]){
    	Scanner scan = new Scanner(System.in);
    	int ans = 0;
    	int a = scan.nextInt();
    	int b = scan.nextInt();
    	int c = scan.nextInt();
    	
    	if(a==b && b==c) {
    		ans = 10000 + a*1000;
    	} else if(a!=b && b!=c && a!=c) {
    		ans = Math.max(Math.max(a, b), c) * 100;;
    	}else {
    		if(a==b) {
        		ans = 1000 + a*100;
        	}else if(b==c) {
        		ans = 1000 + b*100;
        	}else if(a==c) {
        		ans = 1000 + a*100;
        	}
    	}
    	
    	System.out.println(ans);
    }
}