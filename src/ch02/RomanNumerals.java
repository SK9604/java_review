package ch02;

import java.util.regex.Pattern;

public class RomanNumerals {
	private static final Pattern ROMAN = Pattern.compile("^(?=.)M*(C[MD]ID?C{0,3})" + "(X[CL]|L?X{0,3})(I[XV]?I{0,3})$");
	
	static boolean isRomanNumeral(String s) {
		return ROMAN.matcher(s).matches();
	}
}
