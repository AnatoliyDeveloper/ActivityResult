package com.devandroid.activityresult.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.devandroid.activityresult.R;
import com.devandroid.activityresult.util.RequestCode;

public class MainActivity extends AppCompatActivity {

	private TextView textName;
	private TextView textLanguage;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		textName = (TextView) findViewById(R.id.textName);
		textLanguage = (TextView) findViewById(R.id.textLanguage);
	}

	public void onShow(View view){
		Intent intent;
		switch (view.getId()){
			case R.id.btnPresented:
				intent = new Intent(this, PresentedActivity.class);
				startActivityForResult(intent, RequestCode.REQUEST_CODE_PRESENTED);
				break;

			case R.id.btnLanguage:
				intent = new Intent(this, LanguageActivity.class);
				startActivityForResult(intent, RequestCode.REQUEST_CODE_LANGUAGE);
				break;

		}
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		if (resultCode == RESULT_OK){
			switch (requestCode){
				case RequestCode.REQUEST_CODE_PRESENTED:
					String name = data.getStringExtra("name");
					textName.setText("Рад знакомству: " + name);
					break;

				case RequestCode.REQUEST_CODE_LANGUAGE:
					String language = data.getStringExtra("language");
					textLanguage.setText("Ваш язык: " + language);
					break;
			}
		} else {
			Toast.makeText(this, "ERROR", Toast.LENGTH_SHORT).show();
		}
	}
}
