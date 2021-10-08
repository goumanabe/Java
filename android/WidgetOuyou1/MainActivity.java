package com.example.widgetouyou1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher;
import android.widget.ViewSwitcher.ViewFactory;

public class MainActivity extends AppCompatActivity {
    ImageSwitcher mImageSwitcher;
    int[] mImageResources = {R.drawable.p1, R.drawable.p2, R.drawable.p3, R.drawable.p4,
            R.drawable.p5, R.drawable.p6, R.drawable.p7, R.drawable.p8, R.drawable.p9, R.drawable.p10, R.drawable.p11, R.drawable.p12, R.drawable.p13, R.drawable.p14};
    // スライド番号の初期化
    int mSlide = 0;
    // スライド番号を移動させる内容
    private void movePosition(int move) {
        mSlide = mSlide + move;

        // スライド番号が，画像の枚数を超えれば0に戻す
        if (mSlide >= mImageResources.length) {
            mSlide = 0;
        }
        else if (mSlide < 0) {
            mSlide = mImageResources.length -1;
        }

        // スライド番号が，画像の枚数を超えれば0に戻す
        mImageSwitcher.setImageResource(mImageResources[mSlide]);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImageSwitcher = (ImageSwitcher) findViewById(R.id.showImage);
        mImageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(getApplicationContext());
                return imageView;
            }
        });
        Button tapButton = (Button) findViewById(R.id.hu);
        tapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movePosition(1);
            }
        });
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
