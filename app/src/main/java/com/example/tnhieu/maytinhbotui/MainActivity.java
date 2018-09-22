package com.example.tnhieu.maytinhbotui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    private EditText edt;
    private TextView tv;
    private Button bt0, bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt_cong, bt_tru, bt_nhan, bt_chia, bt_cham, bt_C, bt_AC, bt_bang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Init();
        setOnclick();
    }
    public void Init(){
        edt = (EditText) findViewById(R.id.edt);

        tv = (TextView) findViewById(R.id.tv);

        bt0 = (Button) findViewById(R.id.bt0);
        bt1 = (Button) findViewById(R.id.bt1);
        bt2 = (Button) findViewById(R.id.bt2);
        bt3 = (Button) findViewById(R.id.bt3);
        bt4 = (Button) findViewById(R.id.bt4);
        bt5 = (Button) findViewById(R.id.bt5);
        bt6 = (Button) findViewById(R.id.bt6);
        bt7 = (Button) findViewById(R.id.bt7);
        bt8 = (Button) findViewById(R.id.bt8);
        bt9 = (Button) findViewById(R.id.bt9);

        bt_cong = (Button) findViewById(R.id.bt_cong);
        bt_tru = (Button) findViewById(R.id.bt_tru);
        bt_nhan = (Button) findViewById(R.id.bt_nhan);
        bt_chia = (Button) findViewById(R.id.bt_chia);

        bt_C = (Button) findViewById(R.id.bt_C);
        bt_AC = (Button) findViewById(R.id.bt_AC);
        bt_bang = (Button) findViewById(R.id.bt_bang);
        bt_cham = (Button) findViewById(R.id.bt_cham);
    }
    public void setOnclick(){
        bt0.setOnClickListener(this);
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
        bt5.setOnClickListener(this);
        bt6.setOnClickListener(this);
        bt7.setOnClickListener(this);
        bt8.setOnClickListener(this);
        bt9.setOnClickListener(this);

        bt_cong.setOnClickListener(this);
        bt_tru.setOnClickListener(this);
        bt_nhan.setOnClickListener(this);
        bt_chia.setOnClickListener(this);

        bt_AC.setOnClickListener(this);
        bt_C.setOnClickListener(this);
        bt_bang.setOnClickListener(this);
        bt_cham.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt0:{
                edt.append("0");
                break;
            }
            case R.id.bt1:{
                edt.append("1");
                break;
            }
            case R.id.bt2:{
                edt.append("2");
                break;
            }
            case R.id.bt3:{
                edt.append("3");
                break;
            }
            case R.id.bt4:{
                edt.append("4");
                break;
            }
            case R.id.bt5:{
                edt.append("5");
                break;
            }
            case R.id.bt6:{
                edt.append("6");
                break;
            }
            case R.id.bt7:{
                edt.append("7");
                break;
            }
            case R.id.bt8:{
                edt.append("8");
                break;
            }
            case R.id.bt9:{
                edt.append("9");
                break;
            }

            case R.id.bt_cong:{
                edt.append("+");
                break;
            }
            case R.id.bt_tru:{
                edt.append("-");
                break;
            }
            case R.id.bt_nhan:{
                edt.append("*");
                break;
            }
            case R.id.bt_chia:{
                edt.append("/");
                break;
            }

            case R.id.bt_AC:{
                edt.setText("");
                break;
            }
            case R.id.bt_C:{
                BaseInputConnection textFieldInputConnection = new BaseInputConnection(edt, true);
                textFieldInputConnection.sendKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN,KeyEvent.KEYCODE_DEL));
                break;
            }
            case R.id.bt_cham:{
                edt.append(".");
                break;
            }
            default:{

            }
        }
    }
}
