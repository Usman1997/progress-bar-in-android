package com.example.hp.progressbar;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.wang.avi.AVLoadingIndicatorView;

import net.bohush.geometricprogressview.GeometricProgressView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button button1,button2,button3;
Dialog dialog1,dialog2,dialog3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button1:
                dialog1= showProgressBar1(MainActivity.this);
                dialog1.show();
                break;

            case R.id.button2:
                dialog2 =showProgressBar2(MainActivity.this);
                dialog2.show();
                break;

            case R.id.button3:
                dialog3 = showProgressBar3(MainActivity.this);
                dialog3.show();
                break;
        }
    }


    public static Dialog showProgressBar1(Context context) {
        final Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.custom_progress_dialog1);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        AVLoadingIndicatorView loader = (AVLoadingIndicatorView)dialog.findViewById(R.id.progress_bar);
        loader.show();
        return dialog;
    }


    public static Dialog showProgressBar2(Context context) {
        final Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.custom_progress_dialog2);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        return dialog;
    }

    public static Dialog showProgressBar3(Context context) {
        final Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.custom_progress_dialog3);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        GeometricProgressView geometricProgressView = (GeometricProgressView)dialog.findViewById(R.id.progressView);
        geometricProgressView.setVisibility(View.VISIBLE);
        return dialog;
    }

}
