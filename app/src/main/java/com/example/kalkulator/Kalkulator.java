package com.example.kalkulator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Kalkulator extends AppCompatActivity implements View.OnClickListener {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
    Button btambah,bkurang,bkali,bbagi,btitik;
    Button bc,bsamadgn;
    TextView ans;

    public static double nilaiSekarang=0;
    public static String operasiSekarang="";
    public static double hasil=0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        init();
    }

    void init() {

        ans = (TextView)findViewById(R.id.answer);
        b0 = (Button)findViewById(R.id.btn0);
        b0.setOnClickListener(this);
        b1 = (Button)findViewById(R.id.btn1);
        b1.setOnClickListener(this);
        b2 = (Button)findViewById(R.id.btn2);
        b2.setOnClickListener(this);
        b3 = (Button)findViewById(R.id.btn3);
        b3.setOnClickListener(this);
        b4 = (Button)findViewById(R.id.btn4);
        b4.setOnClickListener(this);
        b5 = (Button)findViewById(R.id.btn5);
        b5.setOnClickListener(this);
        b6 = (Button)findViewById(R.id.btn6);
        b6.setOnClickListener(this);
        b7 = (Button)findViewById(R.id.btn7);
        b7.setOnClickListener(this);
        b8 = (Button)findViewById(R.id.btn8);
        b8.setOnClickListener(this);
        b9 = (Button)findViewById(R.id.btn9);
        b9.setOnClickListener(this);
        btitik = (Button)findViewById(R.id.btnTitik);
        btitik.setOnClickListener(this);

        btambah = (Button)findViewById(R.id.btnTambah);
        btambah.setOnClickListener(this);
        bkurang = (Button)findViewById(R.id.btnKurang);
        bkurang.setOnClickListener(this);
        bkali = (Button)findViewById(R.id.btnKali);
        bkali.setOnClickListener(this);
        bbagi = (Button)findViewById(R.id.btnBagi);
        bbagi.setOnClickListener(this);

        bc = (Button)findViewById(R.id.btnhapus);
        bc.setOnClickListener(this);

        bsamadgn = (Button)findViewById(R.id.btnsamadgn);
        bsamadgn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn0:
                ans.setText(ans.getText().toString().trim() + "0");
                break;
            case R.id.btn1:
                ans.setText(ans.getText().toString().trim() + "1");
                break;
            case R.id.btn2:
                ans.setText(ans.getText().toString().trim() + "2");
                break;
            case R.id.btn3:
                ans.setText(ans.getText().toString().trim() + "3");
                break;
            case R.id.btn4:
                ans.setText(ans.getText().toString().trim() + "4");
                break;
            case R.id.btn5:
                ans.setText(ans.getText().toString().trim() + "5");
                break;
            case R.id.btn6:
                ans.setText(ans.getText().toString().trim() + "6");
                break;
            case R.id.btn7:
                ans.setText(ans.getText().toString().trim() + "7");
                break;
            case R.id.btn8:
                ans.setText(ans.getText().toString().trim() + "8");
                break;
            case R.id.btn9:
                ans.setText(ans.getText().toString().trim() + "9");
                break;
            case R.id.btnTitik:
                ans.setText(ans.getText().toString().trim() + ".");
                break;

            case R.id.btnTambah:
                operasiSekarang="tambah";
                nilaiSekarang = Double.parseDouble(ans.getText().toString());
                ans.setText("");
                break;

            case R.id.btnKurang:
                operasiSekarang="kurang";
                nilaiSekarang = Double.parseDouble(ans.getText().toString());
                ans.setText("");
                break;

            case R.id.btnKali:
                operasiSekarang="kali";
                nilaiSekarang = Double.parseDouble(ans.getText().toString());
                ans.setText("");
                break;

            case R.id.btnBagi:
                operasiSekarang="bagi";
                nilaiSekarang = Double.parseDouble(ans.getText().toString());
                ans.setText("");
                break;

            case R.id.btnhapus:

                nilaiSekarang=0;
                ans.setText("");
                break;

            case R.id.btnsamadgn:
                if (operasiSekarang.equals("tambah")){
                    hasil = nilaiSekarang+Double.parseDouble(ans.getText().toString().trim());

                }
                if (operasiSekarang.equals("kurang")){
                    hasil = nilaiSekarang-Double.parseDouble(ans.getText().toString().trim());

                }
                if (operasiSekarang.equals("kali")){
                    hasil = nilaiSekarang*Double.parseDouble(ans.getText().toString().trim());

                }
                if (operasiSekarang.equals("bagi")){
                    hasil = nilaiSekarang/Double.parseDouble(ans.getText().toString().trim());

                }
                if (operasiSekarang.equals("tambah")){
                    hasil = nilaiSekarang+Double.parseDouble(ans.getText().toString().trim());

                }


                    //hasil =2.1
                    //nilaiTemp = 2
                    int nilaiTemp = (int) hasil;

                    //2.1 == 2? tidak sama
                    if (nilaiTemp == hasil){
                        ans.setText(String.valueOf((int)hasil));
                    }else {
                        ans.setText(String.valueOf( hasil));
                    }
                ans.setText(String.valueOf(hasil));
                break;
        }


    }
}