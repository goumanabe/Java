package com.example.filekadai3_kotae;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    SimpleDatabaseHelper helper = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //アプリ初回起動時に、データベースとテーブルを作成しデータを追加してください。
        //追加するデータは、別添のExcelファイルを参照してください。(ファイル名：テーブル.xlsx)
        //データベース名：sample_db
        //テーブル名：books

        //editId(EditText)に本のidを入力すると、txtResultに結果が表示されるアプリを作成してください。
        //例：idを1とした場合
        //本のタイトル：難邸決死釣行記
        //著者：立山秀利
        //出版社：釣漢舎
        //価格：1000
        //発行日：2008/5/25

        //SimpleDatabaseHelper(ヘルパークラスって言います)のインスタンスを生成
        helper = new SimpleDatabaseHelper(MainActivity.this);

        EditText editId = findViewById(R.id.editId);
        TextView txtResult = findViewById(R.id.txtResult);

        editId.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                //テスト用
                //Toast.makeText(MainActivity.this, "アクションID" + actionId, Toast.LENGTH_SHORT).show();
                //Enterキーだったら処理を行う
                //Android上のキーボード（ソフトウェアキーボードといいます）のエンターが押されたかどうか判定
                if (actionId == EditorInfo.IME_ACTION_DONE) {

                    //おまけ、エンターを押すと、ソフトウェアキーボードを閉じる
                    InputMethodManager inputMethodManager = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                    inputMethodManager.hideSoftInputFromWindow(v.getWindowToken(),InputMethodManager.HIDE_NOT_ALWAYS);

                    //ヘルパーを使ってデータベースを取得する
                    //getReadableDatabase()が呼ばれるたびにデータベースに接続することになる。
                    //try-catch-resourceで記述しているので、try終了後にデータベースを切断する
                    try (SQLiteDatabase db = helper.getReadableDatabase()) {
                        //SQLiteを操作するメソッドとして
                        //SELECT文に該当するものが、queryメソッドである
                        //query(テーブル名,検索したい列名,where句,where句の絞り込みで使う文字列,GROUP BY,HAVING,ORDER BY);
                        //queryメソッドを使用して、レコード(行)を取得するイメージなので、whereは基本指定すると思います。
                        //複数行取り出せたとき、Cursorを移動させて次の行へ進めていく(moveToNext()をつかう)
                        //Cursorはqueryで取得できた行のうち、どの行を見ているかを表している
                        Cursor c = db.query("books", new String[]{"title", "author", "publisher", "price", "pub_date"}, "id = ?", new String[]{editId.getText().toString()}, null, null, null);
                        //カーソルを先頭に移動
                        if (c.moveToFirst()) {
                            //titleを取得
                            String title = c.getString(0);
                            //author取得
                            String author = c.getString(1);
                            //publisher取得
                            String publisher = c.getString(2);
                            //price取得
                            int price = c.getInt(3);
                            //pub_date取得
                            String pub_date = c.getString(4);
                            StringBuilder sb = new StringBuilder();
                            sb.append("本のタイトル：" + title + "\n");
                            sb.append("著者：" + author + "\n");
                            sb.append("出版社：" + publisher + "\n");
                            sb.append("価格：" + price + "\n");
                            sb.append("発行日：" + pub_date + "\n");
                            txtResult.setText(sb.toString());
                        } else {
                            Toast.makeText(MainActivity.this, "データなし", Toast.LENGTH_SHORT).show();
                        }
                    }
                    return true;
                }
                return false;
            }
        });
    }
}