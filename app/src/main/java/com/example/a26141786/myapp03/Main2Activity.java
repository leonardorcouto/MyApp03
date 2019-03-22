package com.example.a26141786.myapp03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {


    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        text.findViewById(R.id.texto);
        Bundle dados = getIntent().getExtras();
        text.setText(dados.getString("nome"));
    }
}
