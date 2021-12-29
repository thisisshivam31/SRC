public class Main
{
    public static void main(String [] args){
        System.out.println(rock("Hello"));
		System.out.println(rock("TV"));
    } 
	public static boolean rock(String input) {
	    return input.toLowerCase().matches(".*[aeiou].*");
	}
}
