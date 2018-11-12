package com.example.muhammadwaqar.profileviewer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public ImageView img;
    TextView txt,txt2;
    String names[] ={"Mushahid","Faiz"};
    String rollNO[] ={"F16sw45","F16sw43"};
    Button prev , next;
    int currentImage = 0;
    int []images ={R.drawable.mushi,R.drawable.unnamed,};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = findViewById(R.id.imageView);
        prev = findViewById(R.id.button);
        next = findViewById(R.id.button2);
        txt = findViewById(R.id.textview);
        txt2 = findViewById(R.id.textview2);
    }


    public  void onNext(View view){


        img.setImageResource(images[currentImage]);

        txt.setText(names[currentImage]);
        txt2.setText(rollNO[currentImage]);
        currentImage++;
        if(currentImage >=(images.length)){
            currentImage = 0;
        }

    }
    public  void onPrev(View view){


        img.setImageResource(images[currentImage]);
        txt.setText(names[currentImage]);
        txt2.setText(rollNO[currentImage]);
        currentImage--;
        if(currentImage <0){
            currentImage = images.length-1;

        }

    }
}
