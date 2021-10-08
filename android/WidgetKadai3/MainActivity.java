package com.example.widgetkadai3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //問題１
        //シークバー(sbSize)を操作すると、Toastで現在の値が表示されるようにしなさい。
        //(ちなみに、今回はレイアウト側で最小値を1、最大値を100に設定しています。)
        SeekBar seek = findViewById(R.id.sbSize);
        TextView txt = findViewById(R.id.txtFont);
        seek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(
                    SeekBar seekBar, int progress, boolean fromUser) {
                Toast.makeText(MainActivity.this, "現在値は"+progress, Toast.LENGTH_SHORT).show();

                // 問題1の仕様に加え、txtFontの文字サイズをシークバーで変更できるように設定しなさい。
                txt.setTextSize(progress);
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