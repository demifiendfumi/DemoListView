package com.myapplicationdev.android.demolistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView tvFood = (TextView)findViewById(R.id. tvFood);
        TextView tv_food = (TextView)findViewById(R.id. tvFoodIn);
        TextView tvStar = (TextView)findViewById(R.id. tvStar);
        TextView tv_star = (TextView)findViewById(R.id. tvStarIn);

        Intent i = getIntent();
        String[] item = i.getStringArrayExtra("item");
        tv_food.setText(item[0]);
        tv_star.setText(item[1]);

        Button homeBtn = (Button)findViewById(R.id. buttonHome);
        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); //It's to kill this page, intent will create another main page
            }
        });
    }
}
