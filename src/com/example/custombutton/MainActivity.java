package com.example.custombutton;

import android.os.Bundle;
import android.R.color;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final Button button = (Button) findViewById(R.id.main_custom_button);
		
		button.setOnTouchListener(new Button.OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				final Button button = (Button) findViewById(R.id.main_custom_button);
				
				switch(event.getAction())
				{
					case MotionEvent.ACTION_DOWN:
						button.setTextColor(Color.rgb(231, 230, 230));
						button.setShadowLayer(1, 2, 2, Color.rgb(35, 31, 32));
						break;
						
					case MotionEvent.ACTION_UP:
						button.setTextColor(Color.rgb(65, 65, 65));
						button.setShadowLayer(1, 2, 2, Color.rgb(206, 209, 209));
						break;
				}
				
				
				
				return false;
			}
		});
		
        button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				final Button button = (Button) findViewById(R.id.main_custom_button);
				//button.setShadowLayer(1, 2, 2, Color.rgb(206, 209, 209));
			}
		});
        
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
