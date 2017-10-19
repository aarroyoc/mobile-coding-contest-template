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
    final private String input;
    final private TextView output;
    public Work(EditText input, TextView output) {
        this.input = input.getText().toString();
        this.output = output;
    }

    @Override
    public String doInBackground(Void... args){
        try {
            Thread.sleep(1000);
        }catch(InterruptedException e){

        }
        return "TIMER AGOTADO";
    }

    @Override
    public void onPostExecute(String str){
        output.setText(str);
    }

    @Override
    public void onClick(View v){
        this.execute();
    }
}
