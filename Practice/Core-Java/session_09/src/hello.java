import java.util.regex.Pattern;

public class hello {
	
	public static void main(String[] args) {
		
		CharSequence ch = "abc";
		
		System.out.println(Pattern.matches("[aeiou]", ch));
	}

}
