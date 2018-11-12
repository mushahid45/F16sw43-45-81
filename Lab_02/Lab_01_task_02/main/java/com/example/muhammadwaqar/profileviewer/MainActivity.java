package com.example.muhammadwaqar.profileviewer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView img;
    TextView txt,txt2;
    String carsName[] ={"Mercedz Benz","Scorpio","Macqueen"};
    String carsColor[] ={"White","White","Yellow"};
    Button prev , next;
    int currentImage =0;
    int []images ={R.drawable.img1,R.drawable.img2,R.drawable.img3};
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
        currentImage++;

        img.setImageResource(images[currentImage]);
        txt.setText(carsName[currentImage]);
        txt2.setText(carsColor[currentImage]);
        if(currentImage >(images.length-1)){
            currentImage = 0;
        }
    }
    public  void onPrev(View view){
        currentImage--;

        img.setImageResource(images[currentImage]);
        txt.setText(carsName[currentImage]);
        txt2.setText(carsColor[currentImage]);
        if(currentImage <0){
            currentImage = images.length;
        }
    }
}
