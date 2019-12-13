package com.sonatype.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sonatype.domain.Word;

@Component
public class WordService implements IWordService {

	private NumToWordSysSetting systemSetting;

	@Autowired
	public WordService(NumToWordSysSetting systemSetting) {
		this.systemSetting = systemSetting;
	}

	@Override
	public Word getWordJSON(String wordNum) {

		Word word = new Word();
		word.setNumberInputStr(wordNum);
		word.setWords(NumToWordsApplication.giveWords(wordNum).trim());

		return word;
	}

}
