package com.example.sunrin_08.todo0104_2;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Adapter ad;
    ListView lv;
    final Context context = this;
    Button btn;
    EndDialog end;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        ad = new Adapter();

        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.lv);
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                end = new EndDialog((Context) context);
                end.setCancelable(false);
                end.show();

            }
        });

        //ad.addItem("a", "b", "c");
        lv.setAdapter(ad);
    }
}