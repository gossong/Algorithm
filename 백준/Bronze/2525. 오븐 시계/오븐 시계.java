import java.util.Scanner;

public class Main{
    public static void main(String args[]){
    	Scanner scan = new Scanner(System.in);
    	int hour = scan.nextInt();
    	int min = scan.nextInt() + scan.nextInt();

    	while(min >= 60) {
    		hour++;
    		min-=60;
    	}
    	hour = hour >= 24 ? hour - 24 : hour;
    	System.out.println(hour+" "+min);
    }
}