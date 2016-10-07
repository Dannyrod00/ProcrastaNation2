package com.example.student.procrastanation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ProcrastaNation extends AppCompatActivity {

    private TextView answerText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_procrasta_nation);

        answerText = (TextView) findViewById(R.id.answerText);
        answerText.setText("Reply is hazy, try again.tomorrow");
    }
}
