package com.dsandalgo.algorithm.patternsearching;

public class NaivePatternSearch {

	public static void main(String[] args) {
		String text = "AABABCABC";
		String pattern = "AB";

		NaivePatternSearch naviePatternSearch = new NaivePatternSearch();
		naviePatternSearch.patternSearch(text, pattern);
	}

	public void patternSearch(String text, String pattern) {

		int textLength = text.length();
		int patternLength = pattern.length();

		for (int i = 0; i < textLength - patternLength; i++) {

			String subStringText = text.substring(i, i + patternLength);
			if (pattern.equalsIgnoreCase(subStringText)) {
				System.out.println("Found at index : " + i);
			}
		}

	}

}
