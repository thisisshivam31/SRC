import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner SC = new Scanner(System.in);
	    int n = SC.nextInt();
	    int count = 1;
	    while(count < 11){
	        System.out.println(count*n);
	        count = count + 1;
	    }
	    
    }
}
