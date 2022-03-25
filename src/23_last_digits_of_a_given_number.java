import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a");
	    int a= sc.nextInt();
	    int b= Math.abs(a);
	    int ans = b%10;
	    System.out.println(ans);
	}
}
