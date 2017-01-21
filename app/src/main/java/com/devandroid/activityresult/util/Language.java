package com.devandroid.activityresult.util;

/**
 * Created by Anatoliy on 21.01.2017.
 */

public enum Language {

	ENGLISH("Английский"),
	UKRAINE("Украинский"),
	RUSSIAN("Русский");

	private String language;

	Language(String language) {
		this.language = language;
	}

	public String getLanguage() {
		return language;
	}
}
