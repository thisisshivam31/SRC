import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner SC = new Scanner(System.in);
	    
	    int a = SC.nextInt();
	    int b = SC.nextInt();
	    
	    int operation = SC.nextInt();
	    
	    if(operation==1){
	        System.out.println(a+b);
	    }
	    else if(operation==2){
	        System.out.println(a-b);
	    }
	    else if(operation==3){
	        System.out.println(a*b);
	    }
	    else if(operation==4){
	        System.out.println(a%b);
	    }
	}
}
 
