package ch02;

import java.util.Objects;

public class SpellChecker {
	private static final Lexicon dictionary;
	
	private SpellChecker(Lexicon dictionary) {
		this.dictionary = Objects.requireNonNull(dictionary);
	} //��ü ���� ����
	
	public boolean isValid(String word) {}
	public List<String> suggestions(String typo) {}
}