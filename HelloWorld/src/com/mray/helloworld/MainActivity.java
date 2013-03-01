package com.mray.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View.OnClickListener;
import android.content.Context;
import android.view.View;


public class MainActivity extends Activity {

EditText helloName;
    
/** Called when the activity is first created. */
@Override
public void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
        
// Capture our button from layout
Button button = (Button)findViewById(R.id.go);
        
// Register the onClickListener with the implementation above
button.setOnClickListener(maddListener);
}
    
    // Create an anonymous implementation of OnClickListener
    private OnClickListener maddListener = new OnClickListener() {
    	public void onClick(View v) {
    		long id = 0;
    		// Do something when the button is clicked
    		try {
    		
    		helloName = (EditText)findViewById(R.id.helloName);
    		Context context = getApplicationContext();
    		CharSequence text = "Hello " + helloName.getText() +"!";
    		int duration = Toast.LENGTH_LONG;
    		Toast toast = Toast.makeText(context, text, duration);
    		toast.show();
    		}
    		
    		catch(Exception e) {
    		
    		Context context = getApplicationContext();
    		CharSequence text = e.toString() + "ID = " + id;
    		int duration = Toast.LENGTH_LONG;
    		Toast toast = Toast.makeText(context, text, duration);
    		toast.show();
    		}
    	}
    };

	protected EditText findViewById(Object helloName2) {
		// TODO Auto-generated method stub
		return null;
	}
}
