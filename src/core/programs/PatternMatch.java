package core.programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatch {

	public static void main(String[] args) {
		System.out.println ("manoj@gmail.com : "+Pattern.matches("[a-z]+[@][a-z]+.com","manoj@gmail.com"));
		System.out.println ("6300674709 : "+Pattern.matches("\\d{10}","6300674709"));
		System.out.println ("Manoj80wakale45 : "+Pattern.matches("[MAN][a-z]+\\d{3}+[a-z0-9]+","Manoj80wakale45"));
		
	}

}
