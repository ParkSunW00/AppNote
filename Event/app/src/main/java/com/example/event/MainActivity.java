package com.example.event;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

//이벤트 처리하기
// #1. Activity가 이벤트리스너 인터페이스를 구현(상속)하도록 하기

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    //뷰의 주소를 담을 참조변수 선언
    CheckBox check1, check2;
    Switch switch1;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //참조변수에 주소값 담기
        check1 = findViewById(R.id.checkBox1);
        check2 = findViewById(R.id.checkBox2);
        switch1 = findViewById(R.id.switch1);
        text = findViewById(R.id.TextView);

        //리스너 연결하기
        check1.setOnCheckedChangeListener(this);
        check2.setOnCheckedChangeListener(this);
        switch1.setOnCheckedChangeListener(this);
    }

    @Override //체크박스와 스위치에 발생한 이벤트 처리
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        //매개변수1(compoundButton) : 체크 상태가 변경된 객체의 주소
        //매개변수2(b) : 체크상태

        int id = compoundButton.getId();

        switch (id) {
            case R.id.checkBox1:
                //체크가 됐을 때
                if(b==true) showToast("체크박스1이 체크되었습니다");
                //체크가 안됐을 때
                else showToast("체크박스1이 해제되었습니다");
                break;
            case R.id.checkBox2:
                if(b==true) showToast("체크박스2가 체크되었습니다");
                else showToast("체크박스2가 해제되었습니다");
                break;
            case R.id.switch1:
                if(b==true) showToast("스위치 ON");
                else showToast("스위치 OFF");
                break;
        }
    }
    //토스트를 띄우는 함수
    private void showToast(String message){
        Toast toast = Toast.makeText(this,message,Toast.LENGTH_SHORT);
        toast.show();
    }
    //체크박스의 체크상태를 TextView에 알려주는 메소드
    public void Btn1Method(View view) {
        text.setText("");
        boolean c1 = check1.isChecked();
        boolean c2 = check2.isChecked();

        if(c1==true) text.append("체크박스1 체크됨\n");
        if(c2==true) text.append("체크박스2 체크됨\n");
    }
    //모두체크
    public void Btn2Method(View view) {
        check1.setChecked(true);
        check2.setChecked(true);
    }
    //모두해제
    public void Btn3Method(View view) {
        check1.setChecked(false);
        check2.setChecked(false);
    }
    //Toggle
    public void Btn4Method(View view) {
        check1.toggle();
        check2.toggle();
    }
}