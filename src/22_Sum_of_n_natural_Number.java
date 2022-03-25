import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a");
	    int a= sc.nextInt();
	    System.out.println("Enter d");
	    int d= sc.nextInt();
	    System.out.println("Enter n");
	    int n= sc.nextInt();
	    System.out.println(nthterm(a, d, n));
	}


    public static int nthterm(int a, int d, int n){
    int ans= n/2*(2*a+(n-1) * d);
    return ans;
    }
}
