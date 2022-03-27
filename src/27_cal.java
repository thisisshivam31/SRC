import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a");
	    int a= sc.nextInt();
	    System.out.println("Enter b");
	    int b= sc.nextInt();
	    System.out.println("Enter Operation");
	    int operation= sc.nextInt();
	    
	    if(operation==1){
	        System.out.println(a+b);
	    }
	    else if(operation==2){
	        System.out.println(a-b);
	    }
	    else if(operation==3){
	        System.out.println(a*b);
	    }
	    
	    
	}
}
