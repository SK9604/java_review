package ch02;

import java.util.Objects;

public class SpellChecker {
	private static final Lexicon dictionary;
	
	private SpellChecker(Lexicon dictionary) {
		this.dictionary = Objects.requireNonNull(dictionary);
	} //按眉 积己 规瘤
	
	public boolean isValid(String word) {}
	public List<String> suggestions(String typo) {}
}