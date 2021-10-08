package com.example.widgetkadai2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //問題１
        //chkTestをタップしたとき、チェックがついた場合は、「チェックされてるよ」とchkTestの表示内容を変更し
        //チェックが外れたときは、「チェックされてないよ」と表示できるようにしなさい
        CheckBox chk = findViewById(R.id.chkTest);
        chk.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView,
                                                 boolean isChecked) {
                        TextView txt =findViewById(R.id.chkTest);
                        txt.setText(isChecked ? "チェックされてるよ":"チェックされてないよ");
                    }
                }
        );
        //問題２
        //btnSwitchをクリックしたとき、swTestがonの場合は「スイッチオン！」
        // offの場合は「スイッチオフ」とToastで表示させなさい。
        //swTestがオンかオフかを確かめる方法は調べてね
        Button btn = findViewById(R.id.btnSwitch);
        Switch sw = findViewById(R.id.swTest);

        btn.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View view){
                        if(sw.isChecked()==true){
                            Toast.makeText(MainActivity.this,"スイッチオン！", Toast.LENGTH_SHORT).show();
                        }else{ Toast.makeText(MainActivity.this,"スイッチOFF", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );


//最初にスイッチを押さないとトーストが出ない、スイッチ押す前に確認押してトースト出るようにする、
        //スイッチの状態をゲットしてそれをトーストする方式でやってみる
//        sw.setOnCheckedChangeListener(
//                new CompoundButton.OnCheckedChangeListener() {
//                    @Override
//                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                                btn.setOnClickListener(
//                                        new View.OnClickListener(){
//                                            @Override
//                                            public void onClick(View view){
//                                                if(isChecked==true) {
//                                                    Toast.makeText(MainActivity.this, "スイッチオン！", Toast.LENGTH_SHORT).show();
//                                                }else{
//                                                    Toast.makeText(MainActivity.this, "スイッチオフ", Toast.LENGTH_SHORT).show();
//                                                }
//                                            }
//                                        }
//                                        );
//                    }
//                }
//        );
        //問題３
        //いずれかのラジオボタンを選択すると
        //Toastで「選ばれたのは、〇〇でした。」と表示させなさい。
        //〇〇はラジオボタンの項目名が入ります。
        RadioGroup rgroup = findViewById(R.id.rgTea);
        rgroup.setOnCheckedChangeListener((group, checkedId) -> {
            RadioButton radio = group.findViewById(checkedId);
            Toast.makeText(MainActivity.this,
                    "選ばれたのは、"+radio.getText().toString()+"でした。", Toast.LENGTH_SHORT).show();
        });

//        RadioGroup rgroup = findViewById(R.id.rgTea);
//        rgroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup group, int checkedId) {
//                RadioButton radio = group.findViewById(checkedId);
//                Toast.makeText(MainActivity.this,
//                        "選ばれたのは、"+radio.getText().toString()+"でした。", Toast.LENGTH_SHORT).show();
//            }
//        });
    }
}