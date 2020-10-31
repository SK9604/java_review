package ch02;

public class SpellChecker {
	private static final Lexicon dictionary = ;
	
	private SpellChecker() {} //按眉 积己 规瘤
	public static SpellChecker INSTANCE = new SpellChecker();
	
	public static boolean isValid(String word) {}
	public static List<String> suggestions(String typo) {}
}
