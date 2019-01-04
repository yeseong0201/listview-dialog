package com.example.sunrin_08.todo0104_2;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class EndDialog extends Dialog {
    SharedPreferences pref;
    private Context context;
    private TextView btn_cancel, btn_ok;

    EditText edt_name, edt_num, edt_birth;

    public EndDialog(@NonNull Context context) {
        super(context);
        this.context = context;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_main);

        edt_name = findViewById(R.id.edt_name);
        edt_num = findViewById(R.id.edt_num);
        edt_birth= findViewById(R.id.edt_birth);

        btn_cancel = findViewById(R.id.btn_no);
        btn_ok = findViewById(R.id.btn_ok);
        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });

        btn_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = edt_name.getText().toString();
                String num = edt_num.getText().toString();
                String birth = edt_birth.getText().toString();
                ((MainActivity)context).ad.addItem(name,num,birth);
                dismiss();



              //  ((MainActivity) context).finish();

            }
        });
    }

}
