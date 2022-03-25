import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a");
	    int a= sc.nextInt();
	    System.out.println("Enter b");
	    int b= sc.nextInt();
	    System.out.println("Enter c");
	    int c= sc.nextInt();
	    int ans_1 = Math.max(a,b);
	    int ans_2 = Math.max(ans_1,c);
	    System.out.println(ans_2);
	}
}
