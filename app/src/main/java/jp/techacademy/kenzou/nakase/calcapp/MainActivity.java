package jp.techacademy.kenzou.nakase.calcapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText mEditText1;
    EditText mEditText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        mEditText1 = (EditText) findViewById(R.id.editText1);
        mEditText2 = (EditText) findViewById(R.id.editText2);
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("VALUE1", Double.parseDouble(mEditText1.getText().toString()));
        intent.putExtra("VALUE2", Double.parseDouble(mEditText2.getText().toString()));

        if (v.getId() == R.id.button1) {
            intent.putExtra("CALC", 1);
        } else if (v.getId() == R.id.button2) {
            intent.putExtra("CALC", 2);
        } else if (v.getId() == R.id.button3) {
            intent.putExtra("CALC", 3);
        } else if (v.getId() == R.id.button4) {
            intent.putExtra("CALC", 4);
        }

        startActivity(intent);
    }
}
