import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner SC = new Scanner(System.in);
	    int a = SC.nextInt();
	    if (a<0){
	        System.out.println("Negative");
	    }
	    else{
		System.out.println(a * (a+1)/2);
	    }
	}
}
