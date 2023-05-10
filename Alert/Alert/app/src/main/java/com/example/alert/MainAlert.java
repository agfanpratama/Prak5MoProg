package com.example.alert;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainAlert extends Activity {
    private Button button1;
    private Button button2;
    EditText nama;
    EditText nim;
    EditText tempat;



    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_alert);
        button1 = (Button) findViewById(R.id.simpan);
//        button2 = (Button) findViewById(R.id.two_button_alert);

        nama = findViewById(R.id.nama);
        nim = findViewById(R.id.nim);
        tempat = findViewById(R.id.lahir);




        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                AlertDialog.Builder builder = new AlertDialog.Builder(
                        MainAlert.this);
                builder.setTitle("Form Mahasiswa");
                builder.setMessage("Nama : Agfan Herru Pratama"+ "\n" + "NIM : 064002100043" + "\n" + "Tempat Lahir : Jakarta");
                builder.setPositiveButton("OK",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                Log.e("info", "OK");
                            }
                        });
                builder.show();
            }
        });

//        button2.setOnClickListener(new View.OnClickListener() {
//            @Override public void onClick(View v) {
//                AlertDialog.Builder builder = new AlertDialog.Builder(
//                        MainAlert.this);
//                builder.setTitle("Contoh Alert");
//                builder.setMessage("Alert dengan 2 Action Button ");
//                builder.setNegativeButton("NO",
//                        new DialogInterface.OnClickListener() {
//                            public void onClick(DialogInterface dialog,
//                                                int which) {
//                                Log.e("info", "NO");
//                            }
//                        });
//                builder.setPositiveButton("YES",
//                        new DialogInterface.OnClickListener() {
//                            public void onClick(DialogInterface dialog,
//                                                int which) {
//                                Log.e("info", "YES");
//                            }
//                        });
//                builder.show();
//            }
//        });

    }
    @Override public boolean onCreateOptionsMenu(Menu menu) {
// Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
