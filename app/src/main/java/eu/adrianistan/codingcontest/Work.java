package eu.adrianistan.codingcontest;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.EditText;
import android.os.AsyncTask;

/**
 * Created by arroyo on 19/10/2017.
 */

public class Work extends AsyncTask<Void,Void,String> implements OnClickListener {
    final private EditText inputE;
    final private TextView output;
    private String input;
    public Work(EditText input, TextView output) {
        this.inputE = input;
        this.output = output;
    }

    @Override
    public String doInBackground(Void... args){
        try {
            Thread.sleep(1000);
        }catch(InterruptedException e){

        }
        return input;
    }

    @Override
    public void onPostExecute(String str){
        output.setText(str);
    }

    @Override
    public void onClick(View v){
        input = this.inputE.getText().toString();
        this.execute();
    }
}
