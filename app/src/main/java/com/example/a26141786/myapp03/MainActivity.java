package com.example.a26141786.myapp03;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button myButton,buttonCamera,buttonExplicito;
    private static final int CAMERA_CODE = 1888;
    private ImageView i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonCamera = findViewById(R.id.button3);
        myButton = findViewById(R.id.b1);
        buttonExplicito = findViewById(R.id.button2);
        myButton.setOnClickListener(new View.OnClickListener() {
    @Override


    public void onClick (View v)
    {
        Intent i = new Intent(Intent.ACTION_SENDTO);
        i.setType("text/plain");
        i.putExtra(Intent.EXTRA_SUBJECT,"Assunto01");
        i.putExtra(Intent.EXTRA_TEXT,"Dados");
        startActivity(Intent.createChooser(i,"Compartilhar..."));
    }


            });


        buttonExplicito.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
        {
            Intent i = new Intent(getApplicationContext(),Main2Activity.class);
            startActivity(i);
        }
    });


        buttonCamera.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE_SECURE);
                startActivityForResult(i,CAMERA_CODE);

            }
        });
    }


}


