package com.example.alarmapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    //참조변수 선언
    TextView bell_name,label;
    CheckBox repeatCheck,vibrateCheck;
    Switch OnOffswitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //참조변수에 주소값 담기
        bell_name=findViewById(R.id.bell_name);
        label=findViewById(R.id.label);
        repeatCheck=findViewById(R.id.repeatCheck);
        vibrateCheck=findViewById(R.id.vibrate);
        OnOffswitch=findViewById(R.id.OnOff);

        //리스너 연결하기
        repeatCheck.setOnCheckedChangeListener(this);
        vibrateCheck.setOnCheckedChangeListener(this);
        OnOffswitch.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        //매개변수1(compoundButton) : 체크 상태가 변경된 객체의 주소
        //매개변수2(b) : 체크상태

        int id = compoundButton.getId();

        switch (id) {
            case R.id.OnOff:
                if(b==true) showToast("알람이 설정되었습니다");
                else showToast("알람이 해제되었습니다");
                break;
            case R.id.repeatCheck:
                if(b==true) showToast("알람을 반복합니다");
                else showToast("반복설정이 해제되었습니다");
                break;
            case R.id.vibrate:
                if(b==true) showToast("진동이 설정되었습니다");
                else showToast("진동설정이 해제되었습니다");
                break;
        }
    }
    private void showToast(String message){
        Toast toast=Toast.makeText(this,message,Toast.LENGTH_SHORT);
        toast.show();
    }
}