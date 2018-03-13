package jp.techacademy.kenzou.nakase.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        Double value1 = intent.getDoubleExtra("VALUE1", 0.0);
        Double value2 = intent.getDoubleExtra("VALUE2", 0.0);
        int calc = intent.getIntExtra("CALC", 0);

        TextView textView = (TextView) findViewById(R.id.textView1);
        if (calc == 1) {
            textView.setText(String.valueOf(value1 + value2));
        } else if (calc == 2) {
            textView.setText(String.valueOf(value1 - value2));
        } else if (calc == 3) {
            textView.setText(String.valueOf(value1 * value2));
        } else if (calc == 4) {
            textView.setText(String.valueOf(value1 / value2));
        }
    }
}


