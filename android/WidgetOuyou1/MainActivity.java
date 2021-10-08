package com.example.widgetouyou1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //応用問題１
        //ラジオボタンで選択された項目の画像をivPicに表示させなさい。
        //(画像はサンプルから持ってきてください。項目名を変更して好きな画像に変更してもいいです)
        RadioGroup rgroup =findViewById(R.id.rgPic);
        ImageView img = findViewById(R.id.ivPic);
        rgroup.setOnCheckedChangeListener((group, checkedId) -> {
            switch(checkedId){
                case R.id.rbBird:
                    img.setImageResource(R.drawable.huu);
                    break;
                case R.id.rbElephant:
                    img.setImageResource(R.drawable.papa);
                    break;
                case R.id.rbHam:
                    img.setImageResource(R.drawable.mama);
                    break;
            }
        });
        //応用問題２
        //sbTransparencyを操作すると、ivPicの透明度が変化するようにしなさい。
        //シークバーのスライダーを左端にしたとき、完全に透明になり、右端の時に不透明になるようにしましょう
        //(シークバーの設定、透明度の設定方法等は検索してみてね)
        SeekBar seek = findViewById(R.id.sbTransparency);

        seek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(
                    SeekBar seekBar, int progress, boolean fromUser) {
                // 問題1の仕様に加え、txtFontの文字サイズをシークバーで変更できるように設定しなさい。
                img.setImageAlpha(progress);
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

    }
}