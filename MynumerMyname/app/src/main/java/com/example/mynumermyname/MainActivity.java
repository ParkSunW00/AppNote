package com.example.mynumermyname;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    ///버튼을 눌렀을 때 메세지가 나타나는 이벤트 처리
    public  void BtnName(View v){
        Toast.makeText(this,"박선우",Toast.LENGTH_LONG).show();
    }

    public void BtnNumber(View v) {
        Toast.makeText(this,"20402",Toast.LENGTH_LONG).show();
    }
}