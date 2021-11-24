public class Main {
    public static void main(String[] args) {

        // Initialized a String variable
        String str = "gnitseT erawtfoS";

        // Created a StringBuffer "sb" and stored all the characters of the String
        StringBuffer sb = new StringBuffer(str);

        // Reversed the occurrence of characters
        sb.reverse();

        // Printed the StringBuffer
        System.out.println(sb);

    }
}
