import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner SC = new Scanner(System.in);
	    int a = SC.nextInt();
	    
	    if(a%4==0 && a%100!=0){
	        System.out.println("Leap");
	    }else if(a%400==0){
	        System.out.println("Leap");
	    }else{
	        System.out.println("Not Leap");
	    }
	    
	}
}
 
