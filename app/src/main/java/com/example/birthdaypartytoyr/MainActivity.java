package com.example.birthdaypartytoyr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    Intent intent;
    Button star;
    LinearLayout lay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intent = new Intent(this, MusicService.class);
        star = (Button)findViewById(R.id.btnStar);
        lay = (LinearLayout)findViewById(R.id.lay);

        star.setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View arg0, MotionEvent arg1) {
                int action = arg1.getAction();
                if(MotionEvent.ACTION_DOWN==action){
                    lay.setBackgroundResource(R.drawable.bangul2);
                    startService(intent);
                }
                else if(MotionEvent.ACTION_UP==action){
                    lay.setBackgroundResource(R.drawable.bangul1);
                    stopService(intent);
                }
                return false;
            }
        });

    }
}
