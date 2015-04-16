package com.example.kumardivyarajat.funfacts;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class MainActivity extends Activity {

    FactModel newfact = new FactModel();
    ColorWheel colorWheel = new ColorWheel();
    RelativeLayout mView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView mFunFacts  = (TextView)findViewById(R.id.fun_facts);
        final Button mButton = (Button)findViewById(R.id.next_facts_button);
        mView = (RelativeLayout)findViewById(R.id.relative_layout);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mFunFacts.setText( newfact.getFacts());
                mView.setBackgroundColor(colorWheel.getColor());
                mButton.setTextColor(colorWheel.getColor());
            }
        });
    }

}
