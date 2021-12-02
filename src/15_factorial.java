import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner SC = new Scanner(System.in);
	    int n = SC.nextInt();
	    int i=1;
	    while(n>0){
	        i=i*n;
	        n--;
	    }
	    System.out.println(i);
    }
}
