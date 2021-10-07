package com.example.hello;


import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;
import android.widget.ViewSwitcher.ViewFactory;
import java.util.Date;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    ImageSwitcher mImageSwitcher;
    int[] mImageResources = {R.drawable.panda1, R.drawable.panda2, R.drawable.panda3, R.drawable.panda4,
            R.drawable.panda5, R.drawable.panda6, R.drawable.panda7, R.drawable.panda8};
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
        Button tapButton = (Button) findViewById(R.id.button1);
        tapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                movePosition(1);
                TextView textView1 = (TextView)findViewById(R.id.textTime);
                textView1.setText("次の写真です");
            }
        });
        //イベントリスナーの方法でonClickを使わずにプログラムで書く
        //ボタンの設定を行いたいので、Botton型の
        Button btnTime2 = findViewById(R.id.btnTime2);
        //このボタンに対してイベントを登録する.setOnClickListenerクリックしたとき。
        //イベントを追加する。OnClickListenerというインターフェイスを実装したクラスのインスタンス
//        Hoge h = new Hoge();
//        btnTime2.setOnClickListener(h);
        //2.匿名クラスで宣言する方法
//        btnTime2.setOnClickListener(
//                new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                TextView txt = findViewById(R.id.textTime);
//                String time =new Date().toString();
//                txt.setText(time);
//            }
//        });
        //3.ラムダ式を使う方法（オーバーライドするべきメソッドが1つの時限定
        btnTime2.setOnClickListener( v -> {
            TextView txt = findViewById(R.id.textTime);
            String time =new Date().toString();
            txt.setText(time);
        });

//        btnTime2.setOnLongClickListener();

        Button btn = findViewById(R.id.btnTime);
        Button hoge = findViewById(R.id.hoge);
//        btn.setOnClickListener(
//                new View.OnClickListener(){
//                    @Override
//                    public void onClick(View view){
//                        TextView txt = findViewById(R.id.textTime);
//                        txt.setText(new Date().toString());
//                    }
//                }
//        );
        btn.setOnLongClickListener(
                new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                TextView txt = findViewById(R.id.textTime);
                txt.setText("現在の時刻はを長押ししてます");
                return true;
            }
        });
        hoge.setOnLongClickListener(
                v -> {
                    TextView txt = findViewById(R.id.textTime);
                    txt.setText("hoge長押ししてます");
                    return false;
                });
//      匿名クラス
//      new View.OnLongClickListener() {
//            @Override
//            public boolean onLongClick(View v) {
//                TextView txt = findViewById(R.id.textTime);
//                txt.setText("hoge長押ししてます");
//                return false;
//            }
//        });

    }
    public void btnCurrent_onClick(View view){
        TextView txt = findViewById(R.id.textTime);
        txt.setText(new Date().toString());
    }

    public void btnCurrent_onClick2(View view){
        TextView txt = findViewById(R.id.textTime);
        txt.setText("ほげ");
    }
}
//内部クラス（MainActivityクラスのメンバとして定義する　メンバクラスともいう）
//1。内部クラスとして、onイベント名Listnerインターフェイスを実装視したクラスを宣言し、インスタンスを渡す
//class Hoge implements View.OnClickListener {
//    @Override
//    public void onClick(View v) {
//        //ここに処理の内容を記述する。イベントハンドラの中身と同じ
//        TextView txt = findViewById(R.id.textTime);
//        String time =new Date().toString();
//        txt.setText(time);
//    }
//}
//OnClickListenerというインターフェイスを実装したクラスのインスタンス.
// インターフェイスは必ずオーバーライドしないとけない
