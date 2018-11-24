package com.example.abiye.endowed;

import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.graphics.drawable.RotateDrawable;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.abiye.endowed.api.ApiInterfaces;
import com.example.abiye.endowed.api.RetrofitClient;

import org.w3c.dom.Text;

import static java.lang.Math.round;

public class EndowedMainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnChange;
    ProgressBar progressBarCircle;
    TextView monthLeftCount;
    ///waiting for DB
    int countOfDays = 500;
    ///
    int percentOfDays;
    int counter = 0;
    ApiInterfaces apiInterface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_endowed_main);
        //button change
        btnChange= (Button)findViewById(R.id.button);
        btnChange.setOnClickListener(this);

        //progress bar
        progressBarCircle = (ProgressBar)findViewById(R.id.progressBar);
        progressAnimation pbAnimation = new progressAnimation();
        pbAnimation.getProgressNumb(daystoPercent(countOfDays),progressBarCircle);
        // left of month
        monthLeftCount = (TextView)findViewById(R.id.monthLeft);
        monthLeftCount.setText(String.valueOf(countOfDays));

        //API connection
        apiInterface = RetrofitClient.getClient().create(ApiInterfaces.class);
    }

    public int daystoPercent(int days){
        percentOfDays = round((days * 100)/1080);
        return percentOfDays;
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.button ){
            Intent intent = new Intent(this, ChangeRateActivity.class);
            startActivity(intent);
        }

    }

}
