import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Year which you want check.");
	    int Year = sc.nextInt();
	    
	    if(Year%4==0 && Year%100!=0){
	        System.out.println("Leap");
	    }
	    else if(Year%400==0){
	        System.out.println("Leap");
	    }
	    else{
	        System.out.println("Not Leap");
	    }
	    
	}
}
