package com.devandroid.activityresult.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.devandroid.activityresult.R;

/**
 * Created by Anatoliy on 21.01.2017.
 */

public class PresentedActivity extends AppCompatActivity {

	private EditText editName;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_presented);

		editName = (EditText) findViewById(R.id.editName);
	}

	public void onPresented(View view){
		Intent intent = new Intent();
		intent.putExtra("name", editName.getText().toString());
		setResult(RESULT_OK, intent);
		finish();
	}
}
