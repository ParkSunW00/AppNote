package com.example.frame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    //뷰의 주소값을 담을 참조변수 선언
    ImageView img1;
    ImageView img2;
    ImageView img3;
    ImageView img4;

    //이미지에 부여할 인덱스 변수 선언
    int ImageIndex=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //뷰의 주소값 담기
        img1=findViewById(R.id.Image01);
        img2=findViewById(R.id.Image02);
        img3=findViewById(R.id.Image03);
        img4=findViewById(R.id.Image04);
    }
    //버튼을 누르면 ImageChange함수를 호출 = 버튼에 연결할 함수
    //버튼에 연결하기 -> onClick
    public void BtnMethod(View v) {
        ImageChange();
    }

    //이미지를 번갈아가면서 보여주기 위한 함수
    private void ImageChange() {
        switch (ImageIndex){
            case 0:
                img1.setVisibility(View.VISIBLE);
                img2.setVisibility(View.INVISIBLE);
                img3.setVisibility(View.INVISIBLE);
                img4.setVisibility(View.INVISIBLE);

                //다음 인덱스를 1번으로 -> 이미지로 넘어감
                ImageIndex=1;
                break;
            case 1:
                img1.setVisibility(View.INVISIBLE);
                img2.setVisibility(View.VISIBLE);
                img3.setVisibility(View.INVISIBLE);
                img4.setVisibility(View.INVISIBLE);

                //다음 인덱스를 2번으로 -> 이미지가 넘어감
                ImageIndex=2;
                break;
            case 2:
                img1.setVisibility(View.INVISIBLE);
                img2.setVisibility(View.INVISIBLE);
                img3.setVisibility(View.VISIBLE);
                img4.setVisibility(View.INVISIBLE);

                //다음 인덱스를 3번으로 -> 이미지가 넘어감
                ImageIndex=3;
                break;
            case 3:
                img1.setVisibility(View.INVISIBLE);
                img2.setVisibility(View.INVISIBLE);
                img3.setVisibility(View.INVISIBLE);
                img4.setVisibility(View.VISIBLE);

                ImageIndex=0;
                break;
        }
    }
}