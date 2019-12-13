package com.sonatype.domain;

public class Word {

	private String numberInputStr;
	private String words;

	public Word() {	
	}
	
	public String getNumberInputStr() {
		return numberInputStr;
	}

	public void setNumberInputStr(String numberInputStr) {
		this.numberInputStr = numberInputStr;
	}

	public String getWords() {
		return words;
	}

	public void setWords(String words) {
		this.words = words;
	}


	
	
	@Override
	public String toString() {
		return "{" + "\"number\"=\"" + numberInputStr + "\", \"words\"=\"" + words + "\"}";
	}
}
