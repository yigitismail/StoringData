package com.yigitismail.storingdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView;
    Button button;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);


         sharedPreferences = this.getSharedPreferences("com.yigitismail.storingdata", Context.MODE_PRIVATE);





    }

    public void save(View view){

        if(!editText.getText().toString().matches("")){

            int userAge = Integer.parseInt(editText.getText().toString());

            textView.setText("Your age: " + userAge);

            sharedPreferences.edit().putInt("storedAge",userAge).apply();

            







        }



    }
}
