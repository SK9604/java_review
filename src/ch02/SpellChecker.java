package ch02;

public class SpellChecker {
	private static final Lexicon dictionary = ;
	
	private SpellChecker() {} //��ü ���� ����
	public static SpellChecker INSTANCE = new SpellChecker();
	
	public static boolean isValid(String word) {}
	public static List<String> suggestions(String typo) {}
}