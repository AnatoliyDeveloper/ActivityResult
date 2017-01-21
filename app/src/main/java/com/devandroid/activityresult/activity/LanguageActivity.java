package com.devandroid.activityresult.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.devandroid.activityresult.R;
import com.devandroid.activityresult.util.Language;

/**
 * Created by Anatoliy on 21.01.2017.
 */

public class LanguageActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_language);
	}

	public void onSelectedLanguage (View view){
		Intent intent;
		switch (view.getId()){
			case R.id.btnEnglish:
				intent = new Intent();
				intent.putExtra("language", Language.ENGLISH.getLanguage());
				setResult(RESULT_OK, intent);
				finish();
				break;

			case R.id.btnUkraine:
				intent = new Intent();
				intent.putExtra("language", Language.UKRAINE.getLanguage());
				setResult(RESULT_OK, intent);
				finish();
				break;

			case R.id.btnRussian:
				intent = new Intent();
				intent.putExtra("language", Language.RUSSIAN.getLanguage());
				setResult(RESULT_OK, intent);
				finish();
				break;
		}
	}
}
