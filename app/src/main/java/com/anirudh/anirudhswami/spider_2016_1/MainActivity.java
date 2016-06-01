package com.anirudh.anirudhswami.spider_2016_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    boolean checked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((Button) findViewById(R.id.inc)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioButton rb = (RadioButton) findViewById(R.id.plus);
                checked = rb.isChecked();
                TextView tv = (TextView) findViewById(R.id.op);
                String s = tv.getText().toString();
                int a = Integer.parseInt(s);
                if (checked) a++;
                else a--;
                s = Integer.toString(a);
                tv.setText(s);
            }
        });
        ((RadioButton) findViewById(R.id.plus)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button but = (Button) findViewById(R.id.inc);
                but.setText("INCREMENT");
            }
        });
        ((RadioButton) findViewById(R.id.minus)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button = (Button) findViewById(R.id.inc);
                button.setText("DECREMENT");
            }
        });
    }
}
