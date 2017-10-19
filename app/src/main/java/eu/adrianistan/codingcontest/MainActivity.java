package eu.adrianistan.codingcontest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.view.View;
import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView text_view;
    private EditText edit_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        text_view = (TextView) findViewById(R.id.textView);
        edit_text = (EditText) findViewById(R.id.editText);

        Work work = new Work(edit_text,text_view);

        button.setOnClickListener(work);

        /*button.setOnClickListener((View v)->{
          LAMBDA SI ANDROID SOPORTASE JAVA 8
        });*/
    }
}