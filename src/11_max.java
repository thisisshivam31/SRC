import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner SC = new Scanner(System.in);
	    int a = SC.nextInt();
	    int b = SC.nextInt();
	    int c = SC.nextInt();
	    int ans_1 = Math.max(a,b);
	    int ans_2 = Math.max(ans_1,c);
		System.out.println(ans_2);
	    
	}
}
