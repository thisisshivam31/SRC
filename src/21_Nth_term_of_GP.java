import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a");
	    int a= sc.nextInt();
	    System.out.println("Enter r");
	    int r= sc.nextInt();
	    System.out.println("Enter n");
	    int n= sc.nextInt();
	    System.out.println(nthterm(a, r, n));
	}

    public static int nthterm(int a, int r, int n){
    int ans= a*(int) Math.pow(r, n-1);
    return ans;
    }
}
