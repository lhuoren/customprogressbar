package com.myexercuse.customprogressbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.myexercuse.customprogressbar.myview.LoadingDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LoadingDialog mLoadingDialog = new LoadingDialog(this,
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT,
                R.style.LoadingDialogLight);
//        mLoadingDialog.show();
        TextView tv = (TextView) findViewById(R.id.helloworld);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mLoadingDialog.dismiss();
            }
        });

    }
}
