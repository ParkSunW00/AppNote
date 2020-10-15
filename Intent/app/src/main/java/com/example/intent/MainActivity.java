//20402 박선우
package com.example.intent;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        Button button1 = findViewById(R.id.btn1); //전화걸기
        Button button2 = findViewById(R.id.btn2); //메뉴화면

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //컴포넌트 이름을 지정하여 화면 전환하기
                String data = editText.getText().toString();

                //전화걸기 화면을 보여줄 Intent 생성
                //액션 : ACTION_VIEW (보여주기)
                //데이터 : 위의 데이터가지고 전화걸기 화면에 보여줌
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse(data));

                //Activity 띄우기
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent 객체 생성
                Intent intent=new Intent(getApplicationContext(), MenuActivity.class);

                //Activity 띄우기
                startActivity(intent);
            }
        });

    }
}